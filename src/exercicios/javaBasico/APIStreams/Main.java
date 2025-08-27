package exercicios.javaBasico.APIStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        var value = List.of("Maria", "João", "Ana", "Pedro", "Lucas")
                .stream()
                .filter(name -> name.endsWith("a"))
                .toList();

        System.out.println(value);
        /*Ex2
        // List<String> debugValues = new ArrayList<>();
       // var value = Stream.of("Maria", "João", "Ana", "Pedro", "Lucas")
              //  .peek(System.out::println)
               // .peek(debugValues::add)
                //.filter(name -> name.endsWith("a"))
               // .toList();


        System.out.println(debugValues);
        System.out.println(value);



        * Ex1:
        var value1 = Stream.generate(() -> new Random().nextInt())
                .limit(5)
                .toArray(Integer[]::new);

        for (var v: value1){
            System.out.println(v);
        }

        System.out.println("==========================");

        var value2 = Stream.generate(() -> new Random().nextInt())
                .limit(5)
                .toArray(Integer[]::new);

        for (var v: value2){
            System.out.println(v);
        }

         */

    }
}
