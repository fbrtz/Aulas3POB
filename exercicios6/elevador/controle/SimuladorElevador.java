package controle;

import dominio.Elevador;
import java.util.Scanner;

public class SimuladorElevador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Elevador elevador = new Elevador(5);
        int opcao;

        do {
            System.out.println("\n=== Elevador ===");
            System.out.println("1 - Subir");
            System.out.println("2 - Descer");
            System.out.println("3 - Exibir Andar Atual");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    elevador.subir();
                    break;
                case 2:
                    elevador.descer();
                    break;
                case 3:
                    elevador.exibirAndar();
                    break;
                case 0:
                    System.out.println("Encerrando simulação...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}

