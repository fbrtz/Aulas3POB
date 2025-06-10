
package model;

public class Carro extends Veiculo {
    private int qtdPortas;

    public Carro(String modelo, String placa, int ano, int qtdPortas) {
        super(modelo, placa, ano);
        this.qtdPortas = qtdPortas;
    }

    @Override
    public void exibirDados() {
        System.out.println("Carro - Modelo: " + getModelo() + " | Placa: " + getPlaca() + " | Ano: " + getAno() + " | Portas: " + qtdPortas);
    }
}
