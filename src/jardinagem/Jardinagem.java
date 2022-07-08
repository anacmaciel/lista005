package jardinagem;

public class Jardinagem {

    String nomeJardim;
    double quantidadeMetros;
    double quantidadePlantas;
    double quantidadeMetrosGramas;
    double kilosAdubo;
    double valorAdubo;
    double valorMetroGrama;
    double valorConteGrama;

    public Jardinagem() {
        this.nomeJardim = nomeJardim;
        this.quantidadeMetros = quantidadeMetros;
        this.quantidadePlantas = quantidadePlantas;
        this.quantidadeMetrosGramas = quantidadeMetrosGramas;
        this.kilosAdubo = kilosAdubo;
        this.valorAdubo = 5.00;
        this.valorMetroGrama = valorMetroGrama;
        this.valorConteGrama = valorConteGrama;
    }


    public void usarAdubo() {
        quantidadeMetros = quantidadeMetros * 50;
        System.out.println("Você precisa de " + quantidadeMetros + quantidadeMetros + " G de adubo");
    }

    public double precoAdubo() {
        double calcularPreco = this.quantidadeMetros * valorAdubo;
        return calcularPreco;
    }

    public void precoGrama() {
        // não estava claro o objetivo desse método
    }

}
