package de.htw_berlin.fb4.calculator.unisono.my_prose_app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SentenceTest {

    @Test
    public void testFirstSentenceContentAndLength() {
        FirstSentence first = new FirstSentence();
        String text = first.get();

        // Test 1: Überprüfe den exakten Inhalt
        assertEquals("Die agile Entwickler*in", text);

        // Test 2: Überprüfe die Länge des Satzes (Exercise 4 Vorgabe)
        assertTrue(text.length() > 0, "Der Satz darf nicht leer sein.");
    }

    @Test
    public void testSecondSentenceContentAndLength() {
        SecondSentence second = new SecondSentence();
        String text = second.get();

        // Test 1: Überprüfe den Inhalt
        assertEquals("schreibt sauberen Quellcode auf einem Debian-System.", text);

        // Test 2: Überprüft die SatzLänge
        assertEquals(54, text.length(), "Die Satzlänge stimmt nicht mit dem erwarteten Wert überein.");
    }
}
