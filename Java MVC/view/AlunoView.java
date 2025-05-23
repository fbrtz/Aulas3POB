package view;

import controller.IAlunosController;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AlunoView {
    private IAlunosController controller;
    private Scanner scanner;


    public AlunoView(IAlunosController controller){
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Alterar Aluno");
            System.out.println("4. Excluir Aluno");
            System.out.println("0. Sair");
            opcao = capturarInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1 -> adicionarAluno();
                case 2 -> listarAlunos();
                case 3 -> alterarAluno();
                case 4 -> excluirAluno();
                case 0 -> System.out.println("Encerrando o programa.");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }


    private void adicionarAluno() {
        String matricula = capturarString("Digite a matrícula: ");
        String nome  = capturarString("Digite o nome: ");
        int cr = capturarInteiro("Digite o CR: ");

        controller.adicionarAlunos(matricula, nome, cr);
        System.out.println("Aluno adicionado com sucesso!");
    }

    private void listarAlunos() {
        controller.listarAlunos().forEach(aluno -> 
            System.out.println("Matricula: " + aluno.getMatricula() + ", Nome: " + aluno.getNome() + ", CR: " + aluno.getCr())
        );
    }

    private void alterarAluno(){
        String matricula = capturarString("Digite a matrícula do aluno: ");
        int cr = capturarInteiro("Digite o novo CR: ");
        if(controller.alterarAlunos(matricula, cr)){
            System.out.println("Aluno alterado e salvo com sucesso!!!");
        }else{
            System.out.println("Falha ao alterar aluno de matrícula "+matricula+", não foi encontrado ou não foi possível modificar!");
        }
    }

    private void excluirAluno() {
        String matricula = capturarString("Digite a matrícula do aluno: ");
        if (controller.excluirAlunos(matricula)) {
            System.out.println("Aluno excluído com sucesso!");
        } else {
            System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
        }
    }
    

    private int capturarInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.nextLine();
            }
        }
    } 
    
    private String capturarString(String mensagem) {
        System.out.print(mensagem);
        return scanner.next();
    }

}
