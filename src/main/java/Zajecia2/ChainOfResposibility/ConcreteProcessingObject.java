package Zajecia2.ChainOfResposibility;

public class ConcreteProcessingObject extends ProcessingObject<String> {

    @Override
    protected String handleWork(String input) {
        return input.toUpperCase();
    }
}
