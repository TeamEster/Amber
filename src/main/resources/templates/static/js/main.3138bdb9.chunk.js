(this.webpackJsonpamber=this.webpackJsonpamber||[]).push([[0],{15:function(e,t,a){e.exports=a.p+"static/media/profile2.22be3d5c.png"},17:function(e,t,a){},30:function(e,t,a){},33:function(e,t,a){e.exports=a.p+"static/media/logo.5d5d9eef.svg"},36:function(e,t,a){e.exports=a(67)},41:function(e,t,a){},59:function(e,t,a){},65:function(e,t,a){},66:function(e,t,a){},67:function(e,t,a){"use strict";a.r(t);var n=a(0),c=a.n(n),r=a(31),l=a.n(r),o=(a(41),a(5)),i=a(6),u=a(8),m=a(7),s=a(9),d=a(32),p=a.n(d),f=a(13),h=a(11),E=a(33),b=a.n(E),v=a(15),j=a.n(v),O=(a(17),a(59),function(e){function t(){return Object(o.a)(this,t),Object(u.a)(this,Object(m.a)(t).apply(this,arguments))}return Object(s.a)(t,e),Object(i.a)(t,[{key:"render",value:function(){var e=this.props.username;return null==e&&(e=""),c.a.createElement("header",{className:"header"},c.a.createElement("div",{className:"row"},c.a.createElement("img",{className:"logo column-1",src:b.a,alt:"Logo"}),c.a.createElement("h2",{className:"column-10"},"Welcome, ",e),c.a.createElement("img",{className:"profilePic column-1",src:j.a,alt:"profile"})),c.a.createElement("div",{className:"navbar row"},c.a.createElement("button",{className:"column-4"},c.a.createElement(f.b,{to:"/activity"},"Activity")),c.a.createElement("button",{className:"column-4"},c.a.createElement(f.b,{to:"/timesheet"},"Timesheet")),c.a.createElement("button",{className:"column-4"},c.a.createElement(f.b,{to:"/account"},"Account"))))}}]),t}(n.Component)),N=function(e){function t(){return Object(o.a)(this,t),Object(u.a)(this,Object(m.a)(t).apply(this,arguments))}return Object(s.a)(t,e),Object(i.a)(t,[{key:"render",value:function(){return c.a.createElement("div",null,"test")}}]),t}(n.Component),y=(a(65),function(e){function t(){return Object(o.a)(this,t),Object(u.a)(this,Object(m.a)(t).apply(this,arguments))}return Object(s.a)(t,e),Object(i.a)(t,[{key:"render",value:function(){var e=this.props.account;return c.a.createElement("form",{className:"row"},c.a.createElement("img",{className:"profilepic column-12",src:j.a,alt:"profile"}),c.a.createElement("input",{className:"column-12",dir:"auto",defaultValue:e.firstName}),c.a.createElement("input",{className:"column-12",dir:"auto",defaultValue:e.lastName}),c.a.createElement("input",{className:"column-12",dir:"auto",defaultValue:e.username}),c.a.createElement("input",{className:"column-12",dir:"auto",defaultValue:e.cardId}),c.a.createElement("input",{className:"column-12",dir:"auto",defaultValue:e.roleId}))}}]),t}(n.Component));a(30);var g=function(e){return c.a.createElement("div",{className:"activity row"},c.a.createElement("div",{className:"date column-6"},e.date),c.a.createElement("div",{className:"time column-6"},e.time))},w=[{_id:"1",date:"2019-12-05",time:"12:35:41.123"},{_id:"2",date:"2019-12-05",time:"08:35:41.123"},{_id:"3",date:"2019-12-04",time:"12:35:41.123"},{_id:"4",date:"2019-12-04",time:"08:35:41.123"}],k=function(e){function t(){return Object(o.a)(this,t),Object(u.a)(this,Object(m.a)(t).apply(this,arguments))}return Object(s.a)(t,e),Object(i.a)(t,[{key:"render",value:function(){var e=w.map((function(e){return c.a.createElement(g,{key:e._id,date:e.date,time:e.time})}));return c.a.createElement("div",{className:"activities"},e)}}]),t}(n.Component),C=(a(66),function(e){function t(e){var a;return Object(o.a)(this,t),(a=Object(u.a)(this,Object(m.a)(t).call(this,e))).state={account:""},a}return Object(s.a)(t,e),Object(i.a)(t,[{key:"componentDidMount",value:function(){var e=this;p.a.get("http://si01dw-wrk014.com.euroscript.local:8080/users/user",{params:{username:"fran"}}).then((function(t){console.log(t),e.setState({account:t.data[0]})})).catch((function(e){console.log(e)}))}},{key:"render",value:function(){var e=this.state.account;return c.a.createElement(f.a,null,c.a.createElement(O,{username:e.username}),c.a.createElement(h.c,null,c.a.createElement(h.a,{exact:!0,path:"/"},c.a.createElement("div",null,c.a.createElement("p",null,"No data"))),c.a.createElement(h.a,{path:"/activity"},c.a.createElement(k,null)),c.a.createElement(h.a,{path:"/timesheet"},c.a.createElement(N,null)),c.a.createElement(h.a,{path:"/account"},c.a.createElement(y,{account:e}))))}}]),t}(n.Component));Boolean("localhost"===window.location.hostname||"[::1]"===window.location.hostname||window.location.hostname.match(/^127(?:\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$/));l.a.render(c.a.createElement(C,null),document.getElementById("root")),"serviceWorker"in navigator&&navigator.serviceWorker.ready.then((function(e){e.unregister()}))}},[[36,1,2]]]);
//# sourceMappingURL=main.3138bdb9.chunk.js.map