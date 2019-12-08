import React, { Component } from 'react';
import MenuOption from './MenuOption';
import { EventEmmiter } from '../events';

import '../../style/menu.css';

import dashboard from '../../image/dashboard.svg';
import timesheet from '../../image/timesheet.svg';
import reports from '../../image/reports.svg';

class Menu extends Component {
    constructor(props) {
        super(props);

        this.state = {
            isLoading: true,
            activeId: null
        };
    }

    componentDidMount() {
        this._menuData = [
            {id: 'dashboard', iconSrc: `${dashboard}`, label: 'Dashboard', selected: true},
            {id: 'timesheet', iconSrc: `${timesheet}`, label: 'Timesheet', selected: false},
            {id: 'reports', iconSrc: `${reports}`, label: 'Reports', selected: false}
        ];

        this.setState({
            isLoading: false,
            activeId: this._menuData[0].id
        });

        EventEmmiter.dispatch('viewChange', this._menuData[0].id);
    }

    handleClick(clickedOptionId) {
        const clickedOptionData = this._menuData.find((data) => {
            return data.id === clickedOptionId;
        });

        if (clickedOptionData && this.state.activeId !== clickedOptionData.id) {
            this.setState({
                activeId: clickedOptionData.id
            });

            EventEmmiter.dispatch('viewChange', clickedOptionData.id);
        }
    }

    render() {
        let menuOptions = [];
        
        if (!this.state.isLoading) {
            menuOptions = this._menuData.map((data)=> {
                return <MenuOption key={data.id} data={data} isSelected={this.state.activeId === data.id} onClick={this.handleClick.bind(this)}/>;
            });
        }

        return (
            <nav className="menu">
                <ul>{menuOptions}</ul>
            </nav>
        );
    }
}

export default Menu;