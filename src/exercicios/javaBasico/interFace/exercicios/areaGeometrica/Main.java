package exercicios.javaBasico.interFace.exercicios.areaGeometrica;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

     static class main {
        public  static void main(String[] args) {
            int option;
            GeometricForm geometricForm = null;
            while (true) {
                System.out.println("Escolha a foram geometrica da aréa:");
                System.out.println("1 - Quadrado");
                System.out.println("2 - Retangulo");
                System.out.println("3 - Circulo");
                System.out.println("4 - Sair");
                option = scanner.nextInt();

                if (option == 1) {
                    geometricForm =  createSquare();
                } else if (option == 2) {
                   geometricForm = createRectangle();
                } else if (option == 3) {
                    geometricForm =createCircle();
                } else if (option == 4) {
                    break;
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
                }

                System.out.println("A área é: " + geometricForm.getArea());

              /*  switch (option) {
                    case 1 -> createSquare();
                    case 2 -> createRectangle();
                    case 3 -> createCircle();
                    default -> {
                    }

               */
            }
        }




        }

        private static GeometricForm createSquare() {
            System.out.println("Informe os tamanhos dos lados: ");
            var side = scanner.nextDouble();
            return new Square(side);
        }

        private static GeometricForm createRectangle() {
            System.out.println("Informe a base: ");
            var base = scanner.nextDouble();
            System.out.println("Informe a altura: ");
            var height = scanner.nextDouble();
            return new Rectangle(height, base);
        }

        private static GeometricForm createCircle() {
            System.out.println("Informe o  raio: ");
            var radius = scanner.nextDouble();

            return new Circle(radius);
        }
//     System.out.println("Opção inválida. Tente novamente.");
    }

