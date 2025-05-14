package domain;

public class Moto extends Veiculo{
    private boolean partidaEletrica;

    public Moto(String marca, int ano, boolean partidaEletrica) {
        super(marca, ano);
        this.partidaEletrica = partidaEletrica;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

   @Override
   public void exibirDados(){
        super.exibirDados();
        if (partidaEletrica){
            System.out.println("Partida Elétrica: Sim");
        }else{
            System.out.println("Partida Elétrica: Não");  
        }
   }
}
