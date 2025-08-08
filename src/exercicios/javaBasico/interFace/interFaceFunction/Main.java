package exercicios.javaBasico.interFace.interFaceFunction;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("maria", 21), new User("joão", 32),
                new User("eduardo", 40), new User("ana", 19));


        printStringValue(Record::toString, users);
       // printStringValue(user ->String.valueOf(user.age()), users);
       // printStringValue(User::name, users);

    }

    private static void printStringValue(Function<User, String> callback, List<User> users) {
        users.forEach(u -> System.out.println(callback.apply(u)));

    }
}

/*
        Ex3:
        users.forEach(System.out::println);

         Ex2:
        users.forEach(new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.private

       Ex1 :
       var consumer = new Consumer<User>() {

            @Override
            public void accept(User user) {
                System.out.println(user);

            }
            public Consumer<User> andThen(final Consumer<? super User> after){
            //    return  Consumer.super.andThen(after);
            }

        };
        users.forEach(consumer);
 */
