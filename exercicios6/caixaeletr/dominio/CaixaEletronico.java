package dominio;

public class CaixaEletronico {
    private double saldo;

    public CaixaEletronico(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido. Digite um valor positivo.");
        } else if (valor % 10 != 0) {
            System.out.println("Só é possível sacar valores múltiplos de R$10.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado com sucesso.\n", valor);
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual: R$%.2f\n", saldo);
    }
}
