import React from 'react';
import {useState} from 'react';

import Square from "./Square";
import Piece from './Piece';

const Board = () => {
    // const [boardData, setBoardData] = useState();

    // const getBoardData = async() => {

    // }

    const squares = [];
    for (let x=0; x<8; x++){
        squares[x] = [];
        for (let y=0; y<8; y++){
            let piece = <Piece piece="rook" colour="black"/>;
            let square = <Square colour={(x + y) % 2 != 0 ? "white" : "black"} piece={piece}/>;
            squares[x][y] = {"id": x + "" + y, "square": square};
        }
    }

    return (
        <div id="board">
            {squares.map((row) => (
                row.map((element) => (
                    <Square key={element.id} colour={element.square.props.colour} piece={element.square.props.piece}/>
                ))
            ))}
        </div>
    );
}

export default Board;