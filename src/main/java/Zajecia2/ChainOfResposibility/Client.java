package Zajecia2.ChainOfResposibility;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Client {
    public static void main(String[] args) {
        ConcreteProcessingObject processingObject = new ConcreteProcessingObject();

        //ProcessingObject<String> p1 = new ConcreteProcessingObject();
        //ProcessingObject<String> p2 = new YourOwnProcessing();

        UnaryOperator<String> p3 = (String text) ->  "HELLO " + text;
        UnaryOperator<String> lowerCase = (String text) -> text.toLowerCase();

//        p1.setSeccessor(p2);
//        String result = p1.handle("Testujemy");
//        System.out.println(result);

        Function<String,String> pipeline = p3.andThen(lowerCase);

        String res = pipeline.apply("WORD");
        System.out.println(res);
//
    }

}
