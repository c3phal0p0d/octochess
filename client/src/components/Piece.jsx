import {ReactComponent as BlackPawn} from '../assets/images/pawn_b.svg';
import {ReactComponent as WhitePawn} from '../assets/images/pawn_w.svg';
import {ReactComponent as BlackKing} from '../assets/images/king_b.svg';
import {ReactComponent as WhiteKing} from '../assets/images/king_w.svg';
import {ReactComponent as BlackQueen} from '../assets/images/queen_b.svg';
import {ReactComponent as WhiteQueen} from '../assets/images/queen_w.svg';
import {ReactComponent as BlackRook} from '../assets/images/rook_b.svg';
import {ReactComponent as WhiteRook} from '../assets/images/rook_w.svg';
import {ReactComponent as BlackBishop} from '../assets/images/bishop_b.svg';
import {ReactComponent as WhiteBishop} from '../assets/images/bishop_w.svg';
import {ReactComponent as BlackKnight} from '../assets/images/knight_b.svg';
import {ReactComponent as WhiteKnight} from '../assets/images/knight_w.svg';

const Piece = ({piece, colour}) => {
    switch (piece){
        case "pawn":
            if (colour=="white"){ return (<WhitePawn/>); } else { return (<BlackPawn/>);}
        case "king":
            if (colour=="white"){ return (<WhiteKing/>);} else { return (<BlackKing/>);}
        case "queen":
            if (colour=="white"){ return (<WhiteQueen/>);} else { return (<BlackQueen/>);}
        case "rook":
            if (colour=="white"){ return (<WhiteRook/>);} else { return (<BlackRook/>);}
        case "bishop":
            if (colour=="white"){ return (<WhiteBishop/>);} else { return (<BlackBishop/>);}
        case "knight":
            if (colour=="white"){ return (<WhiteKnight/>);} else { return (<BlackKnight/>);}
        default: return (<BlackRook/>);
    }
}

export default Piece;