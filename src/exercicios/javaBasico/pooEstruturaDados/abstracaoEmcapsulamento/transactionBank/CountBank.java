package exercicios.javaBasico.pooEstruturaDados.abstracaoEmcapsulamento.transactionBank;

public class CountBank {
    private double balance;
    private double specialCheck;
    private double usedSpecialCheck;


    public CountBank(double  initialDeposit){
        this.balance = initialDeposit;

        if (initialDeposit <= 500.00){
            this.specialCheck = 50.00;
        }else {
            this.specialCheck = initialDeposit * 0.5;
        }

        this.usedSpecialCheck = 0.0;
    }

    public double balanceInquiry(){
        return balance;
    }

    public double checkSpecialCheck(){
        return specialCheck - usedSpecialCheck;
    }

    public boolean usingSpecialCheck(){
        return usedSpecialCheck > 0;
    }

    public void deposit(double value){
        if(usedSpecialCheck > 0){
            double rate = usedSpecialCheck * 0.2;
            double totalDue = usedSpecialCheck + rate;

            if ( value >= totalDue){
                value -= totalDue;
                System.out.println("R$" + totalDue + " usado para quitar o cheque especial (incluindo taxa de 20%)");
                usedSpecialCheck = 0;
            } else{
                usedSpecialCheck -= value / 1.2;
                System.out.println("R$" + value + " usado parcialmente para quitar o cheque especial.");
                return;
            }
        }
        balance += value;
        System.out.println("Depósito de R$" + value + " realizado com sucesso.");
    }

    public boolean withdraw(double value){
        if(value <= balance){
            balance -= value;
            System.out.println("Saque de R$" + value + " realizado com sucesso.");
            return true;
        } else {
            double remaining = value - balance;
            if (remaining <= checkSpecialCheck()) {
                usedSpecialCheck += remaining;
                balance = 0;
                System.out.println("Saque de R$" + value + " realizado usando o cheque especial.");
                return true;
            } else {
                System.out.println("Saque não autorizado: saldo insuficiente.");
                return false;
            }
        }
    }
    public boolean payBill(double value) {
        System.out.println("Pagamento de boleto no valor de R$" + value);
        return withdraw(value);
    }

    public void displayStatus() {
        System.out.println("Saldo atual: R$" + balance);
        System.out.println("Cheque especial disponível: R$" + checkSpecialCheck());
        System.out.println("Usando cheque especial? " + (usingSpecialCheck() ? "Sim" : "Não"));
        System.out.println();
    }
}

