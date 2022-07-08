package exercicio3;

public class CriarContaCorrente {
    public static void main(String[] args) {
        ContaCorrente contaDaAna = new ContaCorrente();
        System.out.println(contaDaAna.saldo);
        contaDaAna.sacar(10);
        System.out.println(contaDaAna.saldo);
        contaDaAna.depositar(50.00);
        System.out.println("Seu saldo é de: " + contaDaAna.saldo);


    }
}
