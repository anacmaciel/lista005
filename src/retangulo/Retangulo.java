package retangulo;

public class Retangulo {
    double base;
    double altura;

    public Retangulo() {
        this.base = 10.0;
        this.altura = 5.0;
    }

    public double mudarValorBase(double novaBase) {
        base = novaBase;

return base;    }

    public double mudarAltura(double novaAltura){

            altura = novaAltura;
            return  altura;
        }

public double calcularArea() {

        return base * altura;
    }

    public double calculoPerimetro() {
        return  2 * (base + altura);

    }

}
