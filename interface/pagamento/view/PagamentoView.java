package view;

import controller.PagamentoController;
import model.*;

public class PagamentoView {
    public static void main(String[] args) {
        PagamentoController controller = new PagamentoController();

        IPagamento cartao = new CartaoCredito();
        IPagamento boleto = new BoletoBancario();

        controller.processarPagamento(cartao, 150.0);
        controller.processarPagamento(boleto, 200.0);
    }
}