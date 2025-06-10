
package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        int opcao;
        do {
            System.out.println("\n1 - Cadastrar novo veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - Sair");
            System.out.print(">> ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Tipo (1-Carro, 2-Moto, 3-Caminhão): ");
                    int tipo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Placa: ");
                    String placa = sc.nextLine();
                    System.out.print("Ano: ");
                    int ano = sc.nextInt();

                    switch (tipo) {
                        case 1 -> {
                            System.out.print("Qtd Portas: ");
                            int portas = sc.nextInt();
                            veiculos.add(new Carro(modelo, placa, ano, portas));
                        }
                        case 2 -> {
                            System.out.print("Cilindrada: ");
                            int cilindrada = sc.nextInt();
                            veiculos.add(new Moto(modelo, placa, ano, cilindrada));
                        }
                        case 3 -> {
                            System.out.print("Capacidade de Carga (toneladas): ");
                            double carga = sc.nextDouble();
                            veiculos.add(new Caminhao(modelo, placa, ano, carga));
                        }
                        default -> System.out.println("Tipo inválido!");
                    }
                }


                case 2 -> {
                    System.out.println("\nVeículos Cadastrados:");
                    for (Veiculo v : veiculos) {
                        v.exibirDados();
                    }
                }

                case 3 -> System.out.println("Encerrando programa.");

                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        sc.close();
    }
}
