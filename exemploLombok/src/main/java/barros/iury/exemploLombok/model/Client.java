package barros.iury.exemploLombok.model;

import lombok.*;

/**
 * @author Iury Barros
 */

@ToString
@NoArgsConstructor @AllArgsConstructor
public class Client {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private  int age;

    /**
     *
     * @return Age in months
     */
    public int calculateAgeInMonths() {
        return this.age * 12;
    }
}
