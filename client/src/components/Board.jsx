import Square from "./Square";
import Piece from './Piece';

const Board = () => {
    const squares = [];
    for (let x=0; x<8; x++){
        squares[x] = [];
        for (let y=0; y<8; y++){
            let piece = Piece("king", "white");
            let square = Square((x + y) % 2 != 0 ? "white" : "black", piece);
            console.log(square.piece);
            squares[x][y] = {"id": x + "" + y, "square": square};
        }
    }
    console.log(squares[0][0]);

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