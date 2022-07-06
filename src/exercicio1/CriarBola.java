package exercicio1;

import exercicio1.Bola;

public class CriarBola {
    public static void main(String[] args) {
        Bola primeiraBola = new Bola();
        primeiraBola.circunferencia = 5;
        primeiraBola.cor = "azul";
        primeiraBola.velocidade = 3;
        primeiraBola.marca = "estrela";
        System.out.println("A primeira bola é " + primeiraBola.cor + ", da marca " + primeiraBola.marca + ", tem velocidade de " + primeiraBola.velocidade + " metros por segundos e circunferência de " + primeiraBola.circunferencia);
        Bola segundaBola = new Bola();
        segundaBola.circunferencia = 2;
        segundaBola.cor = "vermelha";
        segundaBola.marca = "matel";
        segundaBola.velocidade = 15;

        System.out.println("A segunda bola é " + segundaBola.cor + ", da marca " + segundaBola.marca + ", tem velocidade de " +
                segundaBola.velocidade + " metros por segundos e circunferência de " + segundaBola.circunferencia);

    }
}
