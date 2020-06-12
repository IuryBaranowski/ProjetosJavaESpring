package barros.iury.exemploInjecaoDeDependencia;

import barros.iury.exemploInjecaoDeDependencia.model.Cat;
import barros.iury.exemploInjecaoDeDependencia.model.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Iury Barros
 */
@SpringBootApplication
public class ExemploInjecaoDeDependenciaApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemploInjecaoDeDependenciaApplication.class, args);

		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();

	}
}
