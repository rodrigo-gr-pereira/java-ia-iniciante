package exercicios.javaBasico.collections;



import exercicios.javaBasico.collections.domain.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>();
        users.putAll(users);
        users.put("joao@joao.com", new User("João", 25));
        users.put("maria@maria.com", new User("Maria", 30));
        users.put("juca@juca.com", new User("Juca", 28));
        users.put("leo@leo.com", new User("Leo", 22));



        /*
        users.forEach((k, v) -> System.out.printf("key: %s | value: %s \n", k, v));
        System.out.println("=================================");
        users.replace("joao@joao.com", new User("João", 26));
        users.forEach((k, v) -> System.out.printf("key: %s | value: %s \n", k, v));

        System.out.println(users.remove("joao@joao.com"));
        System.out.println(users.remove("leo@leo.com", new User("Leo", 22)));


        System.out.println(users.containsKey("marcos@marcos.com"));
        System.out.println(users.containsValue(new User("Marcos", 40)));

        System.out.println(users);
        System.out.println("=================================");
        users.keySet().forEach(System.out::println);
        System.out.println("==================================");
        users.values().forEach(System.out::println);

        //List<>
        //Set
         */
    }
}
