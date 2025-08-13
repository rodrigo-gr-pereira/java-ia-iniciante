package exercicios.javaBasico.enums;

import exercicios.javaBasico.enums.enumeration.OperationEnum;

public class Main {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        var option = -1;
        while (option != 5){
            System.out.println("Escolha uma opção pelo número:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            option = scanner.nextInt();

            if (option > 5 || option < 1) {
                System.out.println("Opção inválida, tente novamente.");
                continue;
            }

            if (option == 5) break;

            var selectedOperation = OperationEnum.values()[option - 1];

            System.out.println("Digite o primeiro número:");
            var number1 = scanner.nextInt();
            System.out.println("Digite o segundo número:");
            var number2 = scanner.nextInt();

            var result = selectedOperation.getCalculate().apply(number1, number2);

            System.out.printf("%s %s %s = %s \n\n", number1, selectedOperation.getSymbol(), number2, result);

           // System.out.println(selectedOperation);
        }

    }
}
