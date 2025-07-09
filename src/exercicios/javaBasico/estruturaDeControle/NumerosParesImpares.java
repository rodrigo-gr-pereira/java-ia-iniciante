package exercicios.javaBasico.estruturaDeControle;

import java.util.Scanner;

public class NumerosParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos números
        System.out.print("Digite o primeiro número: ");
        int primeiro = scanner.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int segundo = scanner.nextInt();

        // Validação do intervalo
        if (segundo <= primeiro) {
            System.out.println("Erro: o segundo número deve ser maior que o primeiro.");
            return;
        }

        // Escolha entre par ou ímpar
        System.out.print("Você deseja ver os números PARES ou ÍMPARES? (Digite 'par' ou 'impar'): ");
        String escolha = scanner.next().toLowerCase();

        if (!escolha.equals("par") && !escolha.equals("impar")) {
            System.out.println("Escolha inválida. Digite 'par' ou 'impar'.");
            return;
        }

        boolean buscarPares = escolha.equals("par");

        System.out.println("\nNúmeros " + (buscarPares ? "pares" : "ímpares") + " entre " + primeiro + " e " + segundo + " (em ordem decrescente):");

        for (int i = segundo; i >= primeiro; i--) {
            if (buscarPares && i % 2 == 0) {
                System.out.println(i);
            } else if (!buscarPares && i % 2 != 0) {
                System.out.println(i);
            }
        }

        scanner.close();

    }
}
