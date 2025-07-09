package exercicios.javaBasico.estruturaDeControle;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da tabuada:");
        number=scanner.nextInt();
        System.out.printf("A tabuada do numero %s é: \n",number);
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
