package controller;
import domain.*;

public class teste {
    public static void main(String[] args) {
        Aluno a = new Aluno("Fabio",20,"ADS");
        Professor p = new Professor("Louzada",39,5000.234);

        a.exibirDados();
        p.exibirDados();


        
    }
}
