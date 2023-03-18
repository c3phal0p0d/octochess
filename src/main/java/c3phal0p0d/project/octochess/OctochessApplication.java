package c3phal0p0d.project.octochess;

import c3phal0p0d.project.octochess.entity.Game;
import c3phal0p0d.project.octochess.repository.GameRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OctochessApplication {

	public static void main(String[] args) {
		SpringApplication.run(OctochessApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(GameRepository gameRepository){
//		return args -> {
//			Game game = new Game();
//			gameRepository.insert(game);
//		};
//	}

}
