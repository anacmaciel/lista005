package exercicio4;


public class CriarCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Toyota";
        carro.potencia = 2.0;
        carro.quantidadeDePortas = 4;
        carro.modelo = "indefinido";
        System.out.println(carro.modelo);
        System.out.println(carro.marca);
        System.out.println(carro.potencia);
        System.out.println(carro.quantidadeDePortas);
    }

}