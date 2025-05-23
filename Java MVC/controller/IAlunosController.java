package controller;

import java.util.List;
import model.Aluno;

public interface IAlunosController {
    List<Aluno> listarAlunos();
    void adicionarAlunos(String matricula, String nome, int cr);
    boolean alterarAlunos(String matricula, int novocr);
    boolean excluirAlunos(String matricula);
}
