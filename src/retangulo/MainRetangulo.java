package retangulo;

import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Retangulo r1 = new Retangulo();

        r1.calculoPerimetro();

        System.out.println("Qual o tamanho da base do retângulo a ser calculado?");
        r1.mudarValorBase(input.nextDouble());
        System.out.println("Qual a altura do retângulo a ser calculada?");
                r1.mudarAltura(input.nextDouble());
        System.out.println("O perímetro do retângulo é: " + r1.calculoPerimetro());

        System.out.println("A área do retângulo é: " + r1.calcularArea());

    }
}
