package course.udemy.exercises.design_patterns.creational_patterns.abstract_factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiLanguageTest {
    @Test
    void test_es() {
        Questions questions = new QuestionsEs();

        assertEquals("¿que hora es?", questions.questionHour() );
        assertEquals("¿que tiempo hace?", questions.questionTime() );

        Greetings greetings = new GreetingsEs();

        assertEquals("buenos días", greetings.goodMorning());
        assertEquals("buenas tardes", greetings.goodAfternoon());
    }

    @Test
    void test_en() {
        Questions questions = new QuestionsEn();

        assertEquals("what time is it?", questions.questionHour() );
        assertEquals("how is the weather?", questions.questionTime() );

        Greetings greetings = new GreetingsEn();

        assertEquals("good morning", greetings.goodMorning());
        assertEquals("good afternoon", greetings.goodAfternoon());
    }

}