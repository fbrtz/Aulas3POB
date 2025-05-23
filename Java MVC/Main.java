import controller.Aluno_controller;
import view.AlunoView;

public class Main {
    public static void main(String[] args) {
        // Inicializa o controlador de Alunos
        Aluno_controller controller = new Aluno_controller();
        
        // Inicializa a visualização e passa o controlador como dependência
        AlunoView view = new AlunoView(controller);
        
        // Exibe o menu interativo para o usuário
        view.exibirMenu();
    }
}