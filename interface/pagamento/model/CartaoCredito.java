package model;

public class CartaoCredito implements IPagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com Cartão de Crédito.");
    }
}