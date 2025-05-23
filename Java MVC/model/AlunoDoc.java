package model;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlunoDoc {
    private final String arquivo = "alunos.txt";


    public void salvarAlunos(List<Aluno> alunos){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))){
            for (Aluno aluno : alunos) {
                writer.write(aluno.toFileString());
                writer.newLine();
            }
        }catch(IOException e){
            System.out.println("Falha ao salvar: "+e.getMessage());
        }
    }

    public List<Aluno> carregarAlunos(){
        List<Aluno> alunos = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(arquivo))){
            String linha;

            while((linha = reader.readLine()) != null){
                alunos.add(Aluno.fromFileString(linha));
            }


        }catch(FileNotFoundException e){
            System.out.println("Ainda não há arquivos de backup, será feito um ao salvar.");
        }catch(IOException e){
            System.out.println("Erro ao carregar dados do arquivo: "+e.getMessage());
        }

        return Collections.unmodifiableList(alunos);
    }

}
