package controle;

import dominio.CaixaEletronico;
import java.util.Scanner;

public class SimuladorCaixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CaixaEletronico caixa = new CaixaEletronico(500); // saldo inicial R$500
        int opcao;

        do {
            System.out.println("\n=== Caixa Eletrônico ===");
            System.out.println("1 - Sacar");
            System.out.println("2 - Exibir Saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do saque: R$");
                    double valor = sc.nextDouble();
                    caixa.sacar(valor);
                    break;
                case 2:
                    caixa.exibirSaldo();
                    break;
                case 0:
                    System.out.println("Encerrando operações...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
