package exercicio4;

public class Carro {

    int quantidadeDePortas;
    String modelo;
    String marca;
    double potencia;
    boolean ligarCarro;


    public Carro() {

        this.marca = "toyota";
        this.modelo = "corola";
        this.quantidadeDePortas = 4;
        this.potencia = 2.0;
        this.ligarCarro = false;
    }

    public boolean  ligarCarro(){
     return ligarCarro= true;
    }
}
