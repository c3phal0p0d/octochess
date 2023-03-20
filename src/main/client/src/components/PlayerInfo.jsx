import React from 'react';

import {ReactComponent as BlackPawn} from '../assets/images/pieces/pawn_b.svg';
import {ReactComponent as WhitePawn} from '../assets/images/pieces/pawn_w.svg';

const PlayerInfo = ({number, colour}) => {
    return (
        <div className="player-info">
            {colour=="WHITE" ? <WhitePawn/> : <BlackPawn/>}
            <div>
                <div>Player {number}</div>
            </div>
        </div>
    );
}

export default PlayerInfo;