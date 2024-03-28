package Zajecia2.ChainOfResposibility;

public class YourOwnProcessing extends ProcessingObject<String>{

    @Override
    protected String handleWork(String input) {
        return "Helloo " + input;
    }
}
