import React from 'react';

import Board from '../components/Board';
import PlayerInfo from '../components/PlayerInfo';
import Navbar from '../Navbar';

const Game = () => {
    return (
        <>
            <Navbar />
            <div id="content">
                <PlayerInfo/>
                <Board/>
                <PlayerInfo/>
            </div>
        </>
    );
}

export default Game;