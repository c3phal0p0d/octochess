import React from 'react';
import {Link} from "react-router-dom";

const Home = () => {
    return (
        <div id="home">
            <img src="./octochess-icon"/>
            <h1>Octochess</h1>
            <div id="buttons">
                <Link to="/game">Start new game</Link>
                <Link to="/game">Join game</Link>
            </div>
        </div>
    );
}

export default Home;