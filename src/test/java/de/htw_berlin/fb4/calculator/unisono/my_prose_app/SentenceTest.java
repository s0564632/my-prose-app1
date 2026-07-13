package de.htw_berlin.fb4.calculator.unisono.my_prose_app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SentenceTest {

    @Test
    public void testFirstSentenceContentAndLength() {
        FirstSentence first = new FirstSentence();
        String text = first.get();

        assertEquals("Die agile Entwickler*in", text);

        assertTrue(text.length() > 0, "Der Satz darf nicht leer sein.");
    }

    @Test
    public void testSecondSentenceContentAndLength() {
        SecondSentence second = new SecondSentence();
        String text = second.get();

        assertEquals("schreibt sauberen Quellcode auf einem Debian-System.", text);

        assertEquals(52, text.length(), "Die Satzlänge stimmt nicht mit dem erwarteten Wert überein.");
    }
}
