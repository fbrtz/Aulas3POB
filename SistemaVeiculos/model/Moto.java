
package model;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String modelo, String placa, int ano, int cilindrada) {
        super(modelo, placa, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirDados() {
        System.out.println("Moto - Modelo: " + getModelo() + " | Placa: " + getPlaca() + " | Ano: " + getAno() + " | Cilindrada: " + cilindrada + "cc");
    }
}
