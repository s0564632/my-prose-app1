package de.htw_berlin.fb4.calculator.unisono.my_prose_app;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;

public class MainApp {
    public static void main(String[] args) {
        ProseBuilder builder = new ProseBuilder();

        builder.register(new FirstSentence());
        builder.register(new SecondSentence());

        String result = builder.get();

        System.out.println("--- Deine Prose-App Ausgabe ---");
        System.out.println(result);
        System.out.println("-------------------------------");
    }
}
