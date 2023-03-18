import React, { useState, useEffect } from 'react';
import axios from 'axios';

import Board from '../components/Board';
import PlayerInfo from '../components/PlayerInfo';
import Navbar from '../Navbar';

const GAME_API_URL = 'http://localhost:8080/api/game';

const Game = ({isNew}) => {

    const [game, setGame] = useState();

    const getGame = async () => {
        try {
            let response;
            if (isNew){
                response = await axios.post(GAME_API_URL + '/new');
            } else {
                response = await axios.post(GAME_API_URL + '/join/64152f38370c9075bfad8b74');
            }
            setGame(response.data);
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