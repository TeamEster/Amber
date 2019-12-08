import React, { Component } from 'react';
import Menu from './Menu';

import '../../style/sidebar.css';

import logo from '../../image/logo.svg';

class Sidebar extends Component {
    render() {
        return (
            <aside className={this.props.className}>
                <div className="sidebar--logo">
                    <img src={logo} alt="Amber"/>
                </div>
                <Menu/>
            </aside>
        );
    }
}

export default Sidebar;