package exercicio1;

import java.util.Scanner;

public class CriarBola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Bola jabulani = new Bola(5.4, "azul", "estrela", 3.0, "borracha");

        System.out.println("A cor da bola é " + jabulani.mostraCor());
        System.out.println("Qual cor de bola você quer?");

        jabulani.trocaCor(input.next());

        System.out.println("A cor da bola agora é " + jabulani.mostraCor());
    }
}
