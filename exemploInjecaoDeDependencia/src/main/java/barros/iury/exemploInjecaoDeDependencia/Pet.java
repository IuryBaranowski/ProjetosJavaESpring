package barros.iury.exemploInjecaoDeDependencia;

import barros.iury.exemploInjecaoDeDependencia.interfaces.AnimalInterface;
import barros.iury.exemploInjecaoDeDependencia.model.Cat;
import barros.iury.exemploInjecaoDeDependencia.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Iury Barros
 */
@Component
public class Pet {

    @Autowired
    @Qualifier("cat")
    private AnimalInterface animalInterface;

    public void execute() {
        animalInterface.comunicar();
    }
}
