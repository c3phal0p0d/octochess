import React from 'react';

const Square = ({colour, piece}) => {
    return (
        <div className="square" data-colour={colour}>
            {piece}
        </div>
    );
}

export default Square;