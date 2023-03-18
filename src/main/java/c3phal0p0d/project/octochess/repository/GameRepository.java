package c3phal0p0d.project.octochess.repository;

import c3phal0p0d.project.octochess.entity.Game;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GameRepository extends MongoRepository<Game, String> {

}
