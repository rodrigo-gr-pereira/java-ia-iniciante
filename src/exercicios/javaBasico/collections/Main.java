package exercicios.javaBasico.collections;


import exercicios.javaBasico.collections.domain.User;

public class Main {

    public static void main(String[] args) {

        var user = new User("John", 30);
        printValue(user);
        System.out.println(user);
    }

    private static void printValue(User user) {
        user = new User("Jane", 25);
        System.out.println(user);
    }

}
