package exercicio2;

import java.util.Scanner;

public class CriarPessoa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pessoa fulano = new Pessoa();

        System.out.println("Entre com sua idade atual para saber quanto de altura você cresceu por ano.");
        fulano.crescer(input.nextDouble());


    }
}
