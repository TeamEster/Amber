import React, { Component } from 'react';

import '../../style/timesheet.css';

class Timesheet extends Component {
    constructor(props) {
        super(props);

        this.state = {
            isLoading: true
        };

        this._timesheetData = [];
    }

    async componentDidMount() {
        const cors = 'https://cors-anywhere.herokuapp.com/',
            request = await fetch(cors + 'https://project-amber-dev.herokuapp.com/records/all');

        this._timesheetData = await request.json();
        this.setState({isLoading: false});
    }

    render() {
        if (!this.state.isLoading) {
            let timesheetEntries = {};
            
            this._timesheetData.forEach((entry) => {
                if (!timesheetEntries[entry.cardId]) {
                    timesheetEntries[entry.cardId] = [];
                }

                timesheetEntries[entry.cardId].push(entry.timestamp);
            });

            return(
                <div>
                    {Object.keys(timesheetEntries).map((key) => (
                        <div className="timesheet">
                            <div className="timesheet-header"><span>Card ID</span>{key}</div>
                            {timesheetEntries[key].map((entry) => (
                                <div className="timesheet-entry">{entry}</div>
                            ))}
                        </div>
                    ))}
                </div>
            );
        } else {
            return (
                <h1>Timesheet is loading...</h1>
            );
        }
    }
}

export default Timesheet;