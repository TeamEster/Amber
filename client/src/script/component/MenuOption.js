import React, { Component } from 'react';

class MenuOption extends Component {
    handleClick() {
        this.props.onClick(this.props.data.id);
    }

    render() {
        return (
            <li id={this.props.data.id} className={this.props.isSelected ? 'menu--menu-item menu--menu-item-selected' : 'menu--menu-item'} onClick={this.handleClick.bind(this)}>
                {this.props.data.iconSrc && <img src={this.props.data.iconSrc} alt=""/>}
                <span>{this.props.data.label}</span>
            </li>
        );
    }
}

export default MenuOption;