package exercicios.javaBasico.APIStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> values1 = List.of(3, 6, 9, 12);
        List<Integer> values2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        var newValues = values2.stream()
                .filter(values1::contains)
                .peek(n -> System.out.printf("Filter %s \n", n))
                .map(n -> values1.stream().reduce(n, (n1, n2) -> n1 - n2))
                .peek(n -> System.out.printf("Map %s \n", n))
                .collect(Collectors.toSet());

        System.out.println(newValues);


        /* Ex3
        var value = List.of("Maria", "João", "Ana", "Pedro", "Lucas")
                .stream()
                .filter(name -> name.endsWith("a"))
                .toList();

        System.out.println(value);
        Ex2
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
