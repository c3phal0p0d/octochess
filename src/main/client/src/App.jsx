import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';

import './App.css';
import Home from './pages/Home';
import Game from './pages/Game';

const App = () => {
    return (
        <>
            <BrowserRouter>
                <Routes>
                    <Route path="/">
                        <Route index element={<Home />} />
                        <Route path="game" element={<Game isNew={true} />} />
                        <Route path="game/64152f38370c9075bfad8b74" element={<Game isNew={false} />} />
                    </Route>
                </Routes>
            </BrowserRouter>
        </>
    );
}

export default App;