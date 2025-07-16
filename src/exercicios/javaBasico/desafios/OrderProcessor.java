package exercicios.javaBasico.desafios;

import java.util.Scanner;

public class OrderProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        double itemsValue = scanner.nextDouble();
        double shipping = scanner.nextDouble();
        boolean firstPurchase = scanner.nextBoolean();

        // Desconto inicializado
        double discount = 0.0;

        // Aplica 5% de desconto se for a primeira compra
        if (firstPurchase) {
            discount = itemsValue * 0.05;
        }

        double discountedValue = itemsValue - discount;

        // Frete grátis para pedidos >= 200
        if (itemsValue >= 200.0) {
            shipping = 0.0;
        }

        // Valor final = valor com desconto + frete (pode ser zero)
        double finalValue = discountedValue + shipping;

        // Saída formatada com duas casas decimais
        System.out.printf("%.2f\n", finalValue);

        scanner.close();
    }
}

