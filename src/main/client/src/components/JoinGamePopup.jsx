import React, { useState } from "react";
import {useNavigate} from "react-router-dom";

const JoinGamePopup = () => {
    const [gameID, setGameID] = useState("");
    const navigate = useNavigate();

    const handleSubmit = async event => {
        event.preventDefault();
        try {
            navigate('/game/' + gameID);
        }
        catch (error){
            console.log(error);
        }
    }

    return (
        <div className="popup-container">
            <div className="popup">
                <form onSubmit={handleSubmit}>
                    <label>Game ID:</label>
                    <input type="text" name="game-id-input" value={gameID} onChange={(event) => setGameID(event.target.value)} required/>
                    <input type="submit" id="join-button" name="join-button" value="Join"/>
                </form>
            </div>
            <div className="background-overlay"></div>
        </div>
    );
}

export default JoinGamePopup;