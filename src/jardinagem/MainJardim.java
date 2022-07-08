package jardinagem;

import java.util.Scanner;

public class MainJardim {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Jardinagem jardim = new Jardinagem();
        System.out.println("digite quantos metros você quer");
        jardim.quantidadeMetros = input.nextDouble();
        jardim.usarAdubo();
        System.out.println("O preço a ser pago é: " + jardim.precoAdubo());
        jardim.precoGrama();
    }
}
