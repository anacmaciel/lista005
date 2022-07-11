package caixa;

public class Caixa {
    double credito;
    double debito;
    double saldo;
    public Caixa(double saldo) {
        this.credito = credito;
        this.debito = debito;
        this.saldo = saldo;
    }

    public double selecionaCredito() {
        saldo= saldo+credito;
        return  saldo;
    }

    public double selecionaDebito(){
        saldo = saldo-debito;
        return saldo;
    }

}
