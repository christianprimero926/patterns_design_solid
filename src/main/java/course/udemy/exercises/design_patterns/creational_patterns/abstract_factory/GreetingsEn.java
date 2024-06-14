package course.udemy.exercises.design_patterns.creational_patterns.abstract_factory;

public class GreetingsEn implements Greetings {
    @Override
    public String goodMorning() {
        return "good morning";
    }

    @Override
    public String goodAfternoon() {
        return "good afternoon";
    }
}
