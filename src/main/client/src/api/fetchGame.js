import axios from 'axios';

const GAME_API_URL = 'http://localhost:8080/api/game';

export const getNewGame = async () => {
    let response;
    try {
        response = await axios.post(GAME_API_URL + '/new');
    } catch (err) {
        console.log(err);
    }
    return response;
}

export const getExistingGame = async(gameId) => {
    let response;
    try {
        response = await axios.post(GAME_API_URL + '/join/' + gameId);
    } catch (err) {
        console.log(err);
    }
    return response;
}
