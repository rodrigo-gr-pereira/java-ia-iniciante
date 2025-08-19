package exercicios.javaBasico.classOptional;
import static exercicios.javaBasico.classOptional.domain.SexEnum.FEMALE;
import static exercicios.javaBasico.classOptional.domain.SexEnum.MALE;

import exercicios.javaBasico.classOptional.domain.SexEnum;
import exercicios.javaBasico.classOptional.domain.User;
import exercicios.javaBasico.classOptional.domain.UserV2;


import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<User> optional = Optional.of(new User("John", 30, MALE));
        //  System.out.println(optional.get());
        //  Optional<User> optional = Optional.empty();
        //System.out.println(optional.get()); // Throws NoSuchElementException

//        System.out.println(optional.orElse(defaultUser()));

  //      System.out.println(optional.orElseGet(Main::defaultUser));

      //  var newUser = optional.map(user -> new UserV2(user.name(), user.age(), user.sex()));
             //   .orElseThrow();
        Optional<UserV2> newUser = optional
                .map(user -> new UserV2(user.name(), user.age(), user.sex()));
        System.out.println(newUser.orElseThrow());
    }

    private static User defaultUser() {
        System.out.println("Buscando valor default");
        return new User("Maria", 22, FEMALE);
    }
}
