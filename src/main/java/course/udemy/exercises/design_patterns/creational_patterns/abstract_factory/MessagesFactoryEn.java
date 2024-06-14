package course.udemy.exercises.design_patterns.creational_patterns.abstract_factory;

public class MessagesFactoryEn implements MessageFactory {
    @Override
    public Greetings createGreetings() {
        return new GreetingsEn();
    }

    @Override
    public Questions createQuestions() {
        return new QuestionsEn();
    }
}
