package course.udemy.exercises.design_patterns.creational_patterns.abstract_factory;

public class MessagesFactoryEs implements MessageFactory {
    @Override
    public Greetings createGreetings() {
        return new GreetingsEs();
    }

    @Override
    public Questions createQuestions() {
        return new QuestionsEs();
    }
}
