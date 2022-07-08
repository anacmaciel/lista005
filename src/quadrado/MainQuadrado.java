package quadrado;

import java.util.Scanner;
public class MainQuadrado {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Quadrado q1 = new Quadrado();
        System.out.println("O tamanho padrão do quadrado é " + q1.retornaLado());
        System.out.println("Qual o tamanho do lado do quadrado? Tecle enter depois que digitar.");
q1.mudarLado(input.nextDouble() );

        System.out.println("O tamanho do lado do quadrado é: " + q1.retornaLado());        System.out.println("A área do seu quadrado é: " + q1.calcularArea());
        System.out.println("A área calculada do quadrado é " + q1.calcularArea());
    }
}
