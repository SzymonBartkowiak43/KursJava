package Zajecia1;

public class IsLowerCase implements Strategy{

    @Override
    public boolean execute(String s){
        return s.matches("[a-z]+");
    }
}
