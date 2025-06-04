package model;

public class Smartphone implements IDispositivoEletronico {
    public void ligar() {
        System.out.println("Smartphone ligado.");
    }

    public void desligar() {
        System.out.println("Smartphone desligado.");
    }
}
