package model;

public class Televisao implements IDispositivoEletronico {
    public void ligar() {
        System.out.println("TV ligada.");
    }

    public void desligar() {
        System.out.println("TV desligada.");
    }
}
