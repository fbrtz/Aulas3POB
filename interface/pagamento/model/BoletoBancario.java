package model;

public class BoletoBancario implements IPagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com Boleto Bancário.");
    }
}