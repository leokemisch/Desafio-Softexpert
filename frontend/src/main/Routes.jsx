import React from 'react'
import {Switch, Route, Redirect} from 'react-router'

import Home from '../components/home/Home'
import ContactCrud from '../components/contact/ContactCrud'

export default props =>
    <Switch>
        <Route exact path="/" component={Home} />
        <Route path="/contacts" component={ContactCrud} />
        <Redirect from="*" to="/" />
    </Switch>