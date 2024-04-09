package Zajecia4.FactoryPatern;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

class ProductFactory {
    public static Product createCar(String name) {
        switch(name) {
            case "ferrary": return new Ferrary();
            case "bmw": return new BMW();
            case "audi": return  new Audi();
            default: throw new RuntimeException("NO such" + name);
        }
    }
    static final Map<String, Supplier<Product>> map = new HashMap<>();
    static {
        map.put("loan", Ferrary::new);
        map.put("stock", Ferrary::new);
        map.put("bond", Ferrary::new);
    }
    public static Product createProduct(String name) throws IllegalAccessException {
        Supplier<Product> p = map.get(name);
        if(p != null) return p.get();
        throw new IllegalAccessException("No such product" + name);
    }
}

public class Main {


    public static void main(String[] args) {
           // Product car = new ProductFatory.creteCar("audi");


    }












    public class ProductFatory {
        public static Product createCar(String name) {
            switch (name) {
                case "ferrary":
                    return new Ferrary();
                case "BMW":
                    return new BMW();
                case "audi":
                    return new Audi();
                default:
                    throw new RuntimeException("NO such product " + name);
            }
        }
    }
}
