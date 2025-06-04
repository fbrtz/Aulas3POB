package controller;

import model.IDispositivoEletronico;

public class DispositivoController {
    public void ativarDispositivo(IDispositivoEletronico dispositivo) {
        dispositivo.ligar();
    }

    public void desativarDispositivo(IDispositivoEletronico dispositivo) {
        dispositivo.desligar();
    }
}
