package course.udemy.exercises.design_patterns.creational_patterns.builder;


import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Person {

    private String name;
    private int age;
    private String municipality;
    private String school;
    private String placeWork;

    private Person() {
    }


    public static class Builder {
        private final Person person;

        public Builder(String name) {
            person = new Person();
            person.name = name;
        }

        public Builder setMunicipality(String municipality) {
            person.municipality = municipality;
            return this;
        }

        public BuilderElder setOlder(int age) {
            if (age < 18) throw new IllegalArgumentException("es menor de edad " + age);
            person.age = age;
            return new BuilderElder(person);
        }

        public BuilderChild setMinor(int age) {
            if (age >= 18) throw new IllegalArgumentException("es mayor de edad " + age);
            person.age = age;
            return new BuilderChild(person);
        }

    }

    public static class BuilderElder {

        private final Person person;

        private BuilderElder(Person persona) {
            this.person = persona;
        }

        public BuilderElder setPlaceWork(String placeWork) {
            this.person.placeWork = placeWork;
            return this;
        }

        public Person build() {
            return person;
        }
    }

    public static class BuilderChild {

        private final Person persona;

        private BuilderChild(Person persona) {
            this.persona = persona;
        }

        public BuilderChild setSchool(String school) {
            this.persona.school = school;
            return this;
        }

        public Person build() {
            return persona;
        }
    }

}
