import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private final  static String WELCOME_MESSAGE = "Olá informe o seu nome?";

    public static void main(String[] args) {

        //não vai parar o breakpoint;
        Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        String name = scanner.next();
        System.out.println("Informe sua idade?");
        String age = scanner.next();
        System.out.printf("Olá %s sua idade é %s.\n",name, age);

    }
}