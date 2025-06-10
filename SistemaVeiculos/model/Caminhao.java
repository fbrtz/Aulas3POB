
package model;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String modelo, String placa, int ano, double capacidadeCarga) {
        super(modelo, placa, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibirDados() {
        System.out.println("Caminhão - Modelo: " + getModelo() + " | Placa: " + getPlaca() + " | Ano: " + getAno() + " | Capacidade: " + capacidadeCarga + " toneladas");
    }
}
