package course.udemy.exercises.design_patterns.creational_patterns.abstract_factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiLanguageTest {
    @Test
    void test_es() {
        MessageFactory factory = new MessagesFactoryEs();

        Questions questions = factory.createQuestions();
        assertEquals("¿que hora es?", questions.questionHour() );
        assertEquals("¿que tiempo hace?", questions.questionTime() );

        Greetings greetings = factory.createGreetings();
        assertEquals("buenos días", greetings.goodMorning());
        assertEquals("buenas tardes", greetings.goodAfternoon());
    }

    @Test
    void test_en() {
        MessageFactory factory = new MessagesFactoryEn();

        Questions questions = factory.createQuestions();
        assertEquals("what time is it?", questions.questionHour() );
        assertEquals("how is the weather?", questions.questionTime() );

        Greetings greetings = factory.createGreetings();
        assertEquals("good morning", greetings.goodMorning());
        assertEquals("good afternoon", greetings.goodAfternoon());
    }

}