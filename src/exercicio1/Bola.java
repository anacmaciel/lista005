    package exercicio1;

    import java.util.Scanner;

    public class Bola {
    double circunferencia;
    String cor;
    String marca;
    double velocidade;
    String material;


    public String mostraCor() {

        return this.cor;
    }

    public void trocaCor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual cor de bola você quer?");
        cor = input.next();
    }
}



