package barros.iury.exemploInjecaoDeDependencia.model;

import barros.iury.exemploInjecaoDeDependencia.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @Author Iury Barros
 */
@Component
@Qualifier("cat")
public class Cat implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("Miau");
    }
}
