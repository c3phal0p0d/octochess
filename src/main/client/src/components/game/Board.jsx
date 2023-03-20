import React from 'react';

import Square from "./Square";
import Piece from './Piece';

const Board = (squaresData) => {
    const squares = [];

    if (!squaresData){
        return <div>Loading</div>;
    }

    // Initialize empty squares array
    for (let x=0; x<8; x++){
        squares[x] = [];
        for (let y=0; y<8; y++){
            squares[x][y] = {};
        }
    }

    // Populate squares array
    for (let x=0; x<8; x++){
        for (let y=0; y<8; y++){
            let piece;
            let pieceData = squaresData.squaresData[y][x]["piece"];
            if (pieceData){
                piece = <Piece piece={squaresData.squaresData[y][x]["piece"]["type"]} colour={squaresData.squaresData[y][x]["piece"]["colour"]}/>;
            } else {
                piece = <Piece piece={"none"} colour={"none"}/>;
            }

            let square = <Square colour={squaresData.squaresData[y][x]["colour"]} piece={piece}/>;
            squares[7-x][y] = {"id": x + "" + y, "square": square};
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