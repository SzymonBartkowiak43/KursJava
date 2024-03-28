package Zajecia1;

public class IsUpperCase implements  Strategy{

    @Override
    public boolean execute(String s){
        return s.matches("[A-Z]+");
    }
}
