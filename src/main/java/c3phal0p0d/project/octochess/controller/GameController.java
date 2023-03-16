package c3phal0p0d.project.octochess.controller;

import c3phal0p0d.project.octochess.entity.Game;
import c3phal0p0d.project.octochess.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GameController {
    @Autowired
    GameService gameService;

    @GetMapping("/api/game/{id}")
    public ResponseEntity<Game> getGame(@PathVariable Long id){
        return ResponseEntity.ok(gameService.getGame(id));
    }

    @PostMapping("/api/game/new")
    public ResponseEntity<Game> newGame(){
        return ResponseEntity.ok(gameService.newGame());
    }

    @PostMapping("/api/game/join/{id}")
    public ResponseEntity<Game> joinGame(@PathVariable Long id){
        return ResponseEntity.ok(gameService.joinGame(id));
    }

}
