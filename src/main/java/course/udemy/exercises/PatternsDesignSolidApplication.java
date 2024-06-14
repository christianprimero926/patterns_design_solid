package course.udemy.exercises;

import course.udemy.exercises.design_patterns.creational_patterns.builder.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class PatternsDesignSolidApplication {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(PatternsDesignSolidApplication.class.getName());

        SpringApplication.run(PatternsDesignSolidApplication.class, args);

        Person mother = new Person.Builder("Maria")
                .setMunicipality("Selva")
                .setOlder(37)
                .setPlaceWork("Google")
                .build();
        logger.info("Mayor: " + mother.getName() + ", " + mother.getAge() + ", " + mother.getPlaceWork());

        Person son = new Person.Builder("Pedro")
                .setMinor(4)
                .setSchool("Colegio de Selva")
                .build();
        logger.info("Menor: " + son.getName() + ", " + son.getAge() + ", " + son.getSchool());

        // esta codigo NO debe compilar
        /*Person mal = new Person.Builder("Luisa")
                .setOlder(20)
                .setSchool("Colegio de Villa Arriba")
                .build();
        logger.info("Mal: " + mal.getName() + ", " + mal.getAge() + ", " + mal.getSchool());
*/


    }

}
