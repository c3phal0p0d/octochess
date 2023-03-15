package c3phal0p0d.project.octochess.service;

import c3phal0p0d.project.octochess.entity.Game;
//import c3phal0p0d.project.octochess.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
//    @Autowired
//    GameRepository gameRepository;

    /**
     * Create a new game
     * @return game
     */
    public Game newGame(){
        Game game = new Game();
//        gameRepository.insert(game);

        return game;
    }

    /**
     * Join an existing game by its id
     * @param id
     * @return game
     */
    public Game joinGame(Long id){
        Game game = new Game();
//        if (gameRepository.findById(id).isPresent()){
//            game = gameRepository.findById(id).get();
//        }

        return game;
    }

    /**
     * Get an ongoing game by id
     * @param id
     * @return game
     */
    public Game getGame(Long id){
        Game game = new Game();
//        if (gameRepository.findById(id).isPresent()){
//            game = gameRepository.findById(id).get();
//        }

        return game;
    }
}
