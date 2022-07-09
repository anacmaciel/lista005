package caixa;

public class Caixa {
    double credito;
    double debito;
    double saldo = 1000;
    public Caixa() {
        this.credito = credito;
        this.debito = debito;
        this.saldo = saldo;
    }

    public double selecionaCredito() {
        credito= saldo+credito;
        return  credito;
    }

    public double selecionaDebito(){
        debito = saldo-debito;
        return debito;
    }

}
