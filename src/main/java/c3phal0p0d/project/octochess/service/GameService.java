package c3phal0p0d.project.octochess.service;

import c3phal0p0d.project.octochess.entity.Game;
import c3phal0p0d.project.octochess.entity.game.Status;
import c3phal0p0d.project.octochess.repository.GameRepository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GameService {
    private final GameRepository gameRepository;

    /**
     * Create a new game
     * @return game
     */
    public Game newGame(){
        Game game = new Game();
        gameRepository.insert(game);

        return game;
    }

    /**
     * Join an existing game by its id
     * @param id
     * @return game
     */
    public Game joinGame(String id){
        Game game = null;
        if (gameRepository.findById(id).isPresent()){
            //game = gameRepository.findById(id).get();
            //game.setStatus(Status.IN_PROGRESS);
        }

        return game;
    }

}
