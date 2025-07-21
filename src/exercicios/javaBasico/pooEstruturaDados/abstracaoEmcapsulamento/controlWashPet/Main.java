package exercicios.javaBasico.pooEstruturaDados.abstracaoEmcapsulamento.controlWashPet;

import java.util.Scanner;

public class Main {

    private  final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");

        var option = -1;


        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar ãgua da máquina");
            System.out.println("5 - Verificar shampo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - limpar a máquima");
            System.out.println("0 - sair");
            option = scanner.nextInt();

            switch (option){
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case  3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida, tente novamente");
            }

        }while (true);
        //option != 0
    }

    private static  void setWater(){
        System.out.println("Tentanddo colocar agua na máquina");
        petMachine.addWater();
    }

    private static  void setShampoo(){
        System.out.println("Tentanddo colocar shampoo na máquina");
        petMachine.addShampoo();
    }



    private static  void  verifyWater(){
        var amount = petMachine.getWater();
        System.out.println("A máquina está no momento com " +  amount + "litros de shampoo");
    }

    private static  void  verifyShampoo(){
        var amount = petMachine.getShampoo();
        System.out.println("A máquina está no momento com " +  amount + "litros de shampoo");
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    public static void setPetInPetMachine(){
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("Informe o nome do pet");
            name = scanner.next();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);

    }
}
