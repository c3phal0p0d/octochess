import React, { useState, useEffect } from 'react';

import Board from '../components/game/Board';
import PlayerInfo from '../components/PlayerInfo';
import Navbar from '../Navbar';
import {getNewGame, getExistingGame} from '../api/fetchGame';
import {useParams} from 'react-router-dom';

const Game = ({isNew}) => {
    const params = useParams();
    const [game, setGame] = useState();
    const [isLoading, setLoading] = useState(true);

    const getGame = () => {
        let apiPromise;
        if (isNew){
            apiPromise = getNewGame();
        } else {
            console.log(params);
            console.log(params.gameId);
            apiPromise = getExistingGame(params.gameId);
        }
        apiPromise.then(function(response){
            console.log(response.data);
            setGame(response.data);
            setLoading(false);
        });
    }

    useEffect(() => {
        getGame();
    },[])

    if (isLoading){
        return <div>Loading...</div>;
    }

    if (!isLoading && !game){
        return (
            <>
                <Navbar />
                <div>Game with specified ID does not exist</div>
            </>
        );
    }

    return (
        <>
            <Navbar />
            <div id="content">
                <PlayerInfo number={1} colour={"BLACK"}/>
                <Board squaresData={game.board.squares}/>
                <PlayerInfo number={2} colour={"WHITE"}/>
                <div>
                    <div>Game ID: {game.id} </div>
                </div>
            </div>
        </>
    );
}

Game.defaultProps = {
    id: null
}

export default Game;