package course.udemy.exercises.design_patterns.creational_patterns.builder;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class Person {

    private String name;
    private int age;
    private String municipality;
    private String school;
    private String placeWork;


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

        public BuilderOlder setOlder(int age) {
            if (age < 18) throw new IllegalArgumentException("es menor de edad " + age);
            person.age = age;
            return new BuilderOlder(person);
        }

        public BuilderMinor setMinor(int age) {
            if (age >= 18) throw new IllegalArgumentException("es mayor de edad " + age);
            person.age = age;
            return new BuilderMinor(person);
        }

    }

    @AllArgsConstructor
    public static class BuilderOlder {

        private final Person person;

        public BuilderOlder setPlaceWork(String placeWork) {
            this.person.placeWork = placeWork;
            return this;
        }

        public Person build() {
            return person;
        }
    }

    @AllArgsConstructor
    public static class BuilderMinor {

        private final Person persona;

        public BuilderMinor setSchool(String school) {
            this.persona.school = school;
            return this;
        }

        public Person build() {
            return persona;
        }
    }

}
