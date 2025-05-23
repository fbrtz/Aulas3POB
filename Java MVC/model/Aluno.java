package model;

public class Aluno{
    String matricula;
    String nome;
    int cr;
    
    public Aluno(String matricula, String nome, int cr) {
        this.matricula = matricula;
        this.nome = nome;
        this.cr = cr;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCr() {
        return cr;
    }

    public void setCr(int cr) {
        this.cr = cr;
    }
    
    public String toFileString() {
        return matricula + ";" + nome + ";" + cr;
    }

    public static Aluno fromFileString(String line) {
        
        String[] dados = line.split(";");

        if (dados.length != 3){

            throw new IllegalArgumentException("Linha de dados inválida para criação de Produto: " + line);
        }

        try {
           
            String matricula = dados[0];
            String nome = dados[1];
            int cr = Integer.parseInt(dados[2]);
            
            return new Aluno(matricula,nome,cr);
        } catch (NumberFormatException e) {
            
            throw new IllegalArgumentException("Formato inválido em: " + line, e);
        }
    }
}