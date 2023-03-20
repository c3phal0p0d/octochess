import React, { useState } from 'react';
import {Link} from "react-router-dom";

import {ReactComponent as BlackQueen} from '../assets/images/pieces/queen_b.svg';
import JoinGamePopup from '../components/JoinGamePopup';

const Home = () => {
    const showPopup = () => {
        document.querySelector(".popup-container").style.display = "inline";
    }

    return (
        <>
            <div id="home">
                <BlackQueen/>
                <h1>Octochess</h1>
                <div id="buttons">
                    <Link to="/game" className="home-button">Start new game</Link>
                    <button onClick={showPopup}>Join game</button>
                </div>
            </div>
            <JoinGamePopup/>
        </>
    );
}

export default Home;