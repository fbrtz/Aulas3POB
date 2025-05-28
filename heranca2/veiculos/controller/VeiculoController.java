package controller;

import dominio.*;

public class VeiculoController {
    public void mostrarVeiculo(Veiculo v) {
        v.exibirDados();
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);
        Moto moto = new Moto("Honda", "CG 160", 2021, 160);

        VeiculoController controller = new VeiculoController();
        controller.mostrarVeiculo(carro);
        System.out.println();
        controller.mostrarVeiculo(moto);
    }
}