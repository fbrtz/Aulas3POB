package controller;

import model.IFormaGeometrica;

public class FormaGeometricaController {
    public void exibirResultados(IFormaGeometrica forma) {
        System.out.println("Área: " + forma.calcularArea());
        System.out.println("Perímetro: " + forma.calcularPerimetro());
    }
}