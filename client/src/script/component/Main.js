import React, { Component } from 'react';
import Dashboard from './Dashboard';
import Timesheet from './Timesheet';
import Reports from './Reports';
import { EventEmmiter } from '../events';

class Main extends Component {
    constructor(props) {
        super(props);

        this.state = {
            activeViewId: null
        };

        const self = this;

        EventEmmiter.subscribe('viewChange', (viewId) => {
            self.setState({
                activeViewId: viewId
            });
        });
    }

    render() {
        let viewComponent = null;

        if (this.state.activeViewId === 'dashboard') {
            viewComponent = <Dashboard/>;
        } else if (this.state.activeViewId === 'timesheet') {
            viewComponent = <Timesheet/>;
        } else if (this.state.activeViewId === 'reports') {
            viewComponent = <Reports/>;
        }

        return (
            <main className={this.props.className}>
                {viewComponent}
            </main>
        );
    }
}

export default Main;