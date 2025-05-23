package controller;

import java.util.ArrayList;
import java.util.List;
import model.*;

public class Aluno_controller implements IAlunosController{

    private ArrayList<Aluno> alunos;
    private AlunoDoc alunodoc;
    

    public Aluno_controller(){
        this.alunodoc = new AlunoDoc();
        this.alunos = new ArrayList<>(alunodoc.carregarAlunos());

    }
    @Override
    public List<Aluno> listarAlunos(){
        return List.copyOf(alunos);
    }
    @Override
    public void adicionarAlunos(String matricula, String nome, int cr){
        Aluno aluno = new Aluno(matricula, nome ,cr);
        alunos.add(aluno);
        alunodoc.salvarAlunos(alunos);
    }
    @Override
    public boolean alterarAlunos(String matricula, int novoCr){
        Aluno aluno = buscarAlunoPorMatricula(matricula);
        if (aluno != null) {
            aluno.setCr(novoCr);
            alunodoc.salvarAlunos(alunos);
            return true;
        }
        return false;

    }
    @Override
    public boolean excluirAlunos(String matricula){
        Aluno aluno = buscarAlunoPorMatricula(matricula);

        if (aluno != null) {
            alunos.remove(aluno);
            alunodoc.salvarAlunos(alunos);
            return true;
        }
        return false;
    }
    

    private Aluno buscarAlunoPorMatricula(String matricula){
        Aluno achado = alunos.stream()
                    .filter(a -> a.getMatricula().equals(matricula))
                    .findFirst()
                    .orElse(null);

        return (achado != null) ? achado : null;
    }

}
