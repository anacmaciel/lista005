package exercicio1;
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

        jabulani.trocaCor();
        System.out.println("A cor da bola agora é " + jabulani.mostraCor());
    }
}
