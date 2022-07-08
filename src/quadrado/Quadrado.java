package quadrado;

import java.util.Scanner;

public class Quadrado {

    double lado;


    public Quadrado() {
        this.lado = lado;
    }

public  double retornaLado() {
    return this.lado;
    }

    public void mudarLado(double novoLado) {

         lado= novoLado;
    }

    public double calcularArea() {

        return lado*lado;
    }

}

