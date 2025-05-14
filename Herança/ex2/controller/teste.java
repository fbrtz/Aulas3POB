package controller;
import domain.*;

public class teste {
    public static void main(String[] args) {
        Moto m = new Moto("Honda",2012,true);
        Carro c = new Carro("Mitsubish",2023,4);


        m.exibirDados();
        c.exibirDados();
    }

}
