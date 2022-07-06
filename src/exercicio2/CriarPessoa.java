package exercicio2;

public class CriarPessoa {
    public static void main(String[] args) {
        Pessoa primeiraPessoa = new Pessoa();
        primeiraPessoa.nome = "Socorro";
        primeiraPessoa.altura = 1.50;
        primeiraPessoa.idade = 60;
        primeiraPessoa.peso = 50;
        System.out.println("O nome do usuário(a) é " + primeiraPessoa.nome + ", ele(a) tem " + primeiraPessoa.idade + " anos, pesa " + primeiraPessoa.peso + " KG e mede " + primeiraPessoa.altura + " CM");

        Pessoa segundaPessoa = new Pessoa();
        segundaPessoa.nome = "Carlos";
        segundaPessoa.altura = 1.80;
        segundaPessoa.peso = 82;
        segundaPessoa.idade = 25;

        System.out.println("O nome do usuário(a) é " + segundaPessoa.nome + ", ele(a) tem " + segundaPessoa.idade + " anos, pesa " + segundaPessoa.peso + " KG e mede " + segundaPessoa.altura + " CM");

    }

}
