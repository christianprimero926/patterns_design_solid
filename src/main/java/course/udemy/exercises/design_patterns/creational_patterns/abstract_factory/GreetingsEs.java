package course.udemy.exercises.design_patterns.creational_patterns.abstract_factory;

public class GreetingsEs implements Greetings{
    @Override
    public String goodMorning() {
        return "buenos días";
    }

    @Override
    public String goodAfternoon() {
        return "buenas tardes";
    }
}
