package course.udemy.exercises.design_patterns.creational_patterns.abstract_factory;

public class QuestionsEs implements Questions{
    @Override
    public String questionHour() {
        return "¿que hora es?";
    }

    @Override
    public String questionTime() {
        return "¿que tiempo hace?";
    }
}
