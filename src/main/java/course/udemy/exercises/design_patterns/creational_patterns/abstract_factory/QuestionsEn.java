package course.udemy.exercises.design_patterns.creational_patterns.abstract_factory;

public class QuestionsEn implements Questions {
    @Override
    public String questionHour() {
        return "what time is it?";
    }

    @Override
    public String questionTime() {
        return "how is the weather?";
    }
}
