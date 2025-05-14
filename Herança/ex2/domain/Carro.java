package domain;

public class Carro extends Veiculo {
    private int numPorta;

    public Carro(String marca, int ano, int numPorta) {
        super(marca, ano);
        this.numPorta = numPorta;
    }

    public int getNumPorta() {
        return numPorta;
    }

    public void setNumPorta(int numPorta) {
        this.numPorta = numPorta;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Quantidade de portas: "+numPorta);
    }

    
}
