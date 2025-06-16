package model;

public class Produtos{
    int id;
    String nome;
    int qtd;
    
    public Produtos(int id, String nome, int qtd) {
        this.id = id;
        this.nome = nome;
        this.qtd = qtd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void ExibeProduto(){
        System.out.println("|ID: "+id+" | Nome: "+nome+" | QTD: "+qtd);
    }

    


}
