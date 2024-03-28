package Zajecia1;

public class Validator {

    private final Strategy strategy;

    public Validator(Strategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(String string) {
        return strategy.execute(string);
    }
}
