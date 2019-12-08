import React, { Component } from 'react';
import Sidebar from './script/component/Sidebar';
import Main from './script/component/Main';

import './App.css';

class App extends Component {
	render() {
		return (
			<React.Fragment>
				<Sidebar className="app--sidebar"/>
				<Main className="app--main"/>
			</React.Fragment>
		);
	}
}

export default App;
