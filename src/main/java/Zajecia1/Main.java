package Zajecia1;

public class Main {

    public static void main(String[] args) {

        Validator upperCaseValidator = new Validator(new IsUpperCase());
        boolean a1 = upperCaseValidator.validate("TESTOWY");
        System.out.println(a1);

        Validator lowerCaseValidator = new Validator(new IsLowerCase());
        boolean a2 = lowerCaseValidator.validate("testowy");
        System.out.println(a2);

        Validator upperValidator = new Validator((String s) -> s.matches("[A-Z]+"));
        boolean b1 = upperValidator.validate("TESTOWY");
        System.out.println(b1);

        Validator lowerValidator = new Validator((String s) -> s.matches("[a-z]+"));
        boolean b2 = lowerValidator.validate("testowy");
        System.out.println(b2);


    }
}
