package exercicio1;


public class Bola {
    double circunferencia;
    String cor;
    String marca;
    double velocidade;
    String material;

    public Bola(double circunferencia, String cor, String marca, double velocidade, String material) {
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.marca = marca;
        this.velocidade = velocidade;
        this.material = material;
    }

    public String mostraCor() {

        return this.cor;
    }

    public void trocaCor(String novaCor) {
        cor = novaCor;
    }
}



