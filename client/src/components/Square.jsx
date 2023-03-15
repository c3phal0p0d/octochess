import React from 'react';

import Piece from './Piece';

const Square = ({colour, piece}) => {
    return (
        <div className="square" data-colour={colour}>
            {piece}
        </div>
    );
}

export default Square;