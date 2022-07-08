package exercicio3;

public class ContaCorrente {
    String numeroDaConta;
    String nomeDoTitular;
    double saldo;

    public ContaCorrente() {
        this.numeroDaConta = "0800";
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = 50.00;
    }

    public void  depositar(double valor) {

        this.saldo += valor;
    }


    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }



}
