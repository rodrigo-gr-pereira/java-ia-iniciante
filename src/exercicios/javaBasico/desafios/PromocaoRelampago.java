package exercicios.javaBasico.desafios;

import java.math.BigDecimal;
import java.util.Scanner;

public class PromocaoRelampago {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valorCompra = scanner.nextLine();
        System.out.println(calcularDesconto(valorCompra));
        scanner.close();
    }

    public static String calcularDesconto(String valorCompra) {
        BigDecimal valor = new BigDecimal(valorCompra);
        BigDecimal descontoPercentual;

        // TODO: Verifique se o valor é menor que 50.00:

        if (valor.compareTo(new BigDecimal("50.00")) < 0) {
            return "Desconto de 0%";
        }
        // Verifique se o valor é entre 50.00 e 100.00 (inclusive):
        else if (valor.compareTo(new BigDecimal("100.00")) <= 0) {
            return "Desconto de 10%";
        }
        // Caso contrário, o valor é maior que 100.00:
        else {
            return "Desconto de 20%";
        }

    }
}
