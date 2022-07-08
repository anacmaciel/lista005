package exercicio2;

public class Pessoa {
    String nome;
    private double idade;
    double peso;
    double altura;

    public Pessoa() {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public double crescer(double idade) {
        if (idade > 0 && idade < 21) {
            double total = 0;
            total = idade * 0.5;
            System.out.println("Você tem " + total);
            return idade;
        } else {
            System.out.println("Você não está mais em idade de crescimento");
            return altura;
        }
    }
}



