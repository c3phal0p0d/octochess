import React from 'react';

import {ReactComponent as BlackPawn} from '../assets/images/pieces/pawn_b.svg';
import {ReactComponent as WhitePawn} from '../assets/images/pieces/pawn_w.svg';
import {ReactComponent as BlackKing} from '../assets/images/pieces/king_b.svg';
import {ReactComponent as WhiteKing} from '../assets/images/pieces/king_w.svg';
import {ReactComponent as BlackQueen} from '../assets/images/pieces/queen_b.svg';
import {ReactComponent as WhiteQueen} from '../assets/images/pieces/queen_w.svg';
import {ReactComponent as BlackRook} from '../assets/images/pieces/rook_b.svg';
import {ReactComponent as WhiteRook} from '../assets/images/pieces/rook_w.svg';
import {ReactComponent as BlackBishop} from '../assets/images/pieces/bishop_b.svg';
import {ReactComponent as WhiteBishop} from '../assets/images/pieces/bishop_w.svg';
import {ReactComponent as BlackKnight} from '../assets/images/pieces/knight_b.svg';
import {ReactComponent as WhiteKnight} from '../assets/images/pieces/knight_w.svg';

const Piece = ({piece, colour}) => {
    switch (piece){
        case "PAWN":
            if (colour=="WHITE"){ return (<WhitePawn/>); } else { return (<BlackPawn/>);}
        case "KING":
            if (colour=="WHITE"){ return (<WhiteKing/>);} else { return (<BlackKing/>);}
        case "QUEEN":
            if (colour=="WHITE"){ return (<WhiteQueen/>);} else { return (<BlackQueen/>);}
        case "ROOK":
            if (colour=="WHITE"){ return (<WhiteRook/>);} else { return (<BlackRook/>);}
        case "BISHOP":
            if (colour=="WHITE"){ return (<WhiteBishop/>);} else { return (<BlackBishop/>);}
        case "KNIGHT":
            if (colour=="WHITE"){ return (<WhiteKnight/>);} else { return (<BlackKnight/>);}
        default: return (<></>)
    }
}

export default Piece;