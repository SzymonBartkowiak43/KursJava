package Zajecia4.Main;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        UtilityCLass utilityCLass = new UtilityCLass();
        Optional<Integer> i1 = utilityCLass.stringToInt("X");
        System.out.println(i1.orElse(0));
    }


    static class UtilityCLass {
        public  Optional<Integer> stringToInt(String s) {
            try {
                return Optional.of(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                return Optional.empty();
            }
        }
    }
}
