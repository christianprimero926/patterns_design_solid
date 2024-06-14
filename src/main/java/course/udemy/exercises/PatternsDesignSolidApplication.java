package course.udemy.exercises;

import course.udemy.exercises.design_patterns.creational_patterns.builder.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternsDesignSolidApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatternsDesignSolidApplication.class, args);

        Person madre = new Person.Builder("Maria")
                .setMunicipio("Selva")
                .setMayor(37)
                .setLugarTrabajo("Google")
                .build();

        Person hijo = new Person.Builder("Pedro")
                .setMenor(4)
                .setColegio("Colegio de Selva")
                .build();

        // esta codigo NO debe compilar
		/*
		Persona mal = new Persona.Builder("Luisa")
				    .setMayor(20)
				    .setColegio("Colegio de Villa Arriba")
				    .build();
        */
    }

}
