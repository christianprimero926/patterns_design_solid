package course.udemy.exercises.design_patterns.creational_patterns.abstract_factory;

public interface MessageFactory {
    Greetings createGreetings();

    Questions createQuestions();
}
