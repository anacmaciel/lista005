package exercicio3;

public class CriarContaCorrente {
    public static void main(String[] args) {
        ContaCorrente primeiraConta = new ContaCorrente();
        primeiraConta.nomeDoTitular = "Gabriel Santos";
        primeiraConta.numeroDaConta = "0901";
        primeiraConta.saldo = 85.00;
        System.out.println("O usuário(a) " + primeiraConta.nomeDoTitular + ", dono da conta " + primeiraConta.numeroDaConta + ", tem saldo de:R $" + primeiraConta.saldo);

    }
}
