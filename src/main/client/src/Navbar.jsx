import React from 'react';
import {Link} from "react-router-dom";

import {ReactComponent as BlackQueen} from './assets/images/pieces/queen_b.svg';

const Navbar = () => {
    return (
        <nav>
            <Link to="/" className="nav-link"><BlackQueen/></Link>
        </nav>
    );
}

export default Navbar;