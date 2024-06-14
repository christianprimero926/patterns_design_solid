package course.udemy.exercises.design_patterns.creational_patterns.builder;

import lombok.Builder;


public class Person {

    private String nombre;
    private int edad;
    private String municipio;
    private String colegio;
    private String lugarTrabajo;

    private Person() {}


    public static class Builder {
        private Person persona;

        public Builder(String nombre) {
            persona = new Person();
            persona.nombre = nombre;
        }

        public Builder setMunicipio (String municipio) {
            persona.municipio = municipio;
            return this;
        }

        public BuilderMayor setMayor(int edad) {
            if (edad < 18) throw new IllegalArgumentException("es menor de edad " + edad);
            persona.edad = edad;
            return new Person.BuilderMayor(persona);
        }

        public BuilderMenor setMenor(int edad) {
            if (edad >= 18) throw new IllegalArgumentException("es mayor de edad " + edad);
            persona.edad = edad;
            return new Person.BuilderMenor(persona);
        }

    }

    public static class BuilderMayor {

        private Person persona;

        private BuilderMayor (Person persona) {
            this.persona = persona;
        }

        public BuilderMayor setLugarTrabajo (String lugarTrabajo) {
            this.persona.lugarTrabajo = lugarTrabajo;
            return this;
        }

        public Person build() {
            return persona;
        }
    }

    public static class BuilderMenor {

        private Person persona;

        private BuilderMenor (Person persona) {
            this.persona = persona;
        }

        public BuilderMenor setColegio(String colegio) {
            this.persona.colegio = colegio;
            return this;
        }

        public Person build() {
            return persona;
        }
    }

}
