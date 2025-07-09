package exercicios.javaBasico.estruturaDeControle;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + String.format("%.2f", imc));

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc < 30) {
            System.out.println("levemente acima do peso I");
        } else if (imc < 35){
            System.out.println(" Obesidade Grau I");
        }else if (imc < 40){
            System.out.println("Obesidade II ");
        }else {
            System.out.println("Obesidade III(Mórbida)");
        }
    }
}
