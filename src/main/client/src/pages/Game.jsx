import React, { useState, useEffect } from 'react';
import axios from 'axios';

import Board from '../components/Board';
import PlayerInfo from '../components/PlayerInfo';
import Navbar from '../Navbar';

const GAME_API_URL = 'http://localhost:8080/api/game/';

const Game = () => {

    const [game, setGame] = useState();

    const getGame = async () => {
        try {
            const response = await axios.get(GAME_API_URL + '0');
            setGame(response.data);
            console.log(response.data.board.squares);
            console.log("EEEE");
        } catch (err) {
            console.log(err);
        }
    }

    useEffect(() => {
        getGame();
    },[])

    if (!game){
        return <div>Loading</div>;
    }

    console.log(game.board.squares);

    return (
        <>
            <Navbar />
            <div id="content">
                <PlayerInfo/>
                <Board squaresData={game.board.squares}/>
                <PlayerInfo/>
            </div>
        </>
    );
}

export default Game;