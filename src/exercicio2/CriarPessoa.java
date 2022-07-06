package exercicio2;

public class CriarPessoa {
    public static void main(String[] args) {
        Pessoa primeiraPessoa = new Pessoa();
        primeiraPessoa.nome = "Socorro";
        primeiraPessoa.altura = 1.50;
        primeiraPessoa.idade = 60;
        primeiraPessoa.peso = 50;
        System.out.println("O nome do usuário(a) é " + primeiraPessoa.nome + ", ele(a) tem " + primeiraPessoa.idade + " anos, pesa " + primeiraPessoa.peso + " KG e mede " + primeiraPessoa.altura + " CM");


}
