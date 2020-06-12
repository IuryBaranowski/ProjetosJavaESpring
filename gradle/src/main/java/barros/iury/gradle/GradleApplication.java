package barros.iury.gradle;

import barros.iury.gradle.Aluno;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleApplication.class, args);

		System.out.println(new Aluno("Iury", 10.0, 8.0));
	}

}
