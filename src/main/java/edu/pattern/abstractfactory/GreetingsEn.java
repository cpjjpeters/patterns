package edu.pattern.abstractfactory;

public class GreetingsEn implements Greetings {

    @Override
    public String goodMorning() {
        return "good morning";
    }

    @Override
    public String goodAfternoon() {
        return "good afternoon";
    }

}
