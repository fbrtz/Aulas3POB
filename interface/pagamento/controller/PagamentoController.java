package controller;

import model.*;

public class PagamentoController {
    public void processarPagamento(IPagamento pagamento, double valor) {
        pagamento.realizarPagamento(valor);
    }
}