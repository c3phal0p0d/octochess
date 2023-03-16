import React from 'react';
import {Link} from "react-router-dom";

const Navbar = () => {
    return (
        <nav>
            <Link to="/" className="nav-link">Home</Link>
        </nav>
    );
}

export default Navbar;