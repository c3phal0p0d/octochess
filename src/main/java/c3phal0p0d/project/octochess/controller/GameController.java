package c3phal0p0d.project.octochess.controller;

import c3phal0p0d.project.octochess.entity.Game;
import c3phal0p0d.project.octochess.service.GameService;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/game")
public class GameController {
    @Autowired
    private final GameService gameService;

    @PostMapping("/new")
    public ResponseEntity<Game> newGame(){
        return ResponseEntity.ok(gameService.newGame());
    }

    @PostMapping("/join/{id}")
    public ResponseEntity<Game> joinGame(@PathVariable String id){
        return ResponseEntity.ok(gameService.joinGame(id));
    }

}
