package model;

public class Smartphone implements IDispositivoEletronico {
    @Override
    public void ligar() {
        System.out.println("Smartphone ligado.");
    }
    @Override
    public void desligar() {
        System.out.println("Smartphone desligado.");
    }
}
