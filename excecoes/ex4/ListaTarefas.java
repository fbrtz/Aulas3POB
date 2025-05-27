package ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        boolean executando = true;

        while (executando) {
            System.out.println("\n1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa por índice");
            System.out.println("3 - Exibir todas as tarefas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                int opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        System.out.print("Digite a nova tarefa: ");
                        String tarefa = scanner.nextLine();
                        tarefas.add(tarefa);
                        break;
                    case 2:
                        System.out.print("Digite o índice da tarefa a remover: ");
                        int indice = Integer.parseInt(scanner.nextLine());
                        tarefas.remove(indice);
                        System.out.println("Tarefa removida.");
                        break;
                    case 3:
                        System.out.println("\nTarefas:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println(i + ": " + tarefas.get(i));
                        }
                        break;
                    case 0:
                        executando = false;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Erro: você deve digitar um número.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Erro: índice inválido.");
            }
        }
    }
}