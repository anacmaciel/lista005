package exercicio1;

import exercicio1.Bola;
import java.util.Scanner;
public class CriarBola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Bola jabulani = new Bola();
        jabulani.circunferencia= 5;
        jabulani.cor = "azul";
        jabulani.velocidade = 3;
        jabulani.marca = "estrela";
        jabulani.material = "borracha";
        System.out.println("A cor da bola é " + jabulani.mostraCor());
        System.out.println("Com qual cor você quer personalizar sua bola?");
        input.nextLine();
        String personalizaCor = input.nextLine();
        jabulani.trocaCor(personalizaCor);
        System.out.println();
        System.out.println("A cor personalizada é: " + jabulani.mostraCor());

    }
}
