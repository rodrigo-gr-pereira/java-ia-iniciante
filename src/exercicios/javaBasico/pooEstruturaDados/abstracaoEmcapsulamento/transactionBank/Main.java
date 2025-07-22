package exercicios.javaBasico.pooEstruturaDados.abstracaoEmcapsulamento.transactionBank;

public class Main {
    public static void main(String[] args) {
        CountBank count = new CountBank(600.00);

        count.displayStatus();

        count.withdraw(700.00); // usar parte do cheque especial
        count.displayStatus();

        count.deposit(100.00); // tentar quitar o cheque especial
        count.displayStatus();

        count.payBill(50.00);
        count.displayStatus();
    }
}
