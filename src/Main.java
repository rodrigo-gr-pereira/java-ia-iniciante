import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var name = scanner.next();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        var canDrive = (age >= 18) || (age >=16 && isEmancipated);
        if (canDrive) {
            System.out.printf("%s, você pode dirigir \n", name, age);
        } else {
            System.out.printf("%s, você pode dirigir. \n", name);
        }
    }
}

