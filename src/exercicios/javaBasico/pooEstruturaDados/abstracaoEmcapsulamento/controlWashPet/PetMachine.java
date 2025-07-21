package exercicios.javaBasico.pooEstruturaDados.abstracaoEmcapsulamento.controlWashPet;

public class PetMachine {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;

    public void takeAShower(){
        if(this.pet == null){
            System.out.println("Coloque o pet na maquina para iniciar o banho.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + "está limpo");

    }

    public void addWater(){
        if (water == 30){
            System.out.println("A capacidade de agua da maquina está no limite maximo");
            return;
        }

        water += 2;
    }


    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("A capacidade de shampoo da maquina está no limite maximo");
            return;
        }

        shampoo += 2;
    }

    public int getShampoo() {
        return shampoo;
    }

    public int getWater() {
        return water;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet){
        if (!this.clean){
            System.out.println("A maquina está suja, para colocar o pet é necessário limpa-la");
            return;
        }
        if (hasPet()){
            System.out.println("O pet " + this.pet.getName() + " está na maquina nesse momwnto");
        return;
        }

        this.pet = pet;
        System.out.println("Informe o nome do pet: " + pet.getName() + " Foi colocado na máquina");
    }

    public void removePet(){
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " foi retirado na máquina");
        this.pet = null;
    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A maquina está limpa");
    }
}
