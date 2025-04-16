package controle;

import dominio.Aluno;
import java.util.Scanner;

public class GerenciadorAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double nota;

        System.out.print("Digite o nome do aluno: ");
        nome = sc.nextLine();

        //fica pedindo até dar certo
        while (true) {
            System.out.print("Digite a nota do aluno (0 a 10): ");
            nota = sc.nextDouble();

            Aluno aluno = new Aluno(nome, nota);
            if (aluno.validarNota()) {
                System.out.println("\nAluno: " + aluno.getNome());
                System.out.printf("Nota: %.2f\n", aluno.getNota());
                System.out.println("Classificação: " + aluno.classificarAluno());
                break;
            } else {
                System.out.println("Nota inválida! Tente novamente.");
            }
        }

        sc.close();
    }
}
