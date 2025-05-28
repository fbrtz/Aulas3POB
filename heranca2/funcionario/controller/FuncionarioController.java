package controller;

import dominio.*;

public class FuncionarioController {
    public void exibirSalario(Funcionario funcionario) {
        System.out.println("Funcionário: " + funcionario.getNome() +
                " | Salário Final: R$ " + funcionario.calcularSalario());
    }

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Carlos", 3000);
        Gerente g1 = new Gerente("Ana", 5000);
        Estagiario e1 = new Estagiario("Lucas", 1500);

        FuncionarioController controller = new FuncionarioController();
        controller.exibirSalario(f1);
        controller.exibirSalario(g1);
        controller.exibirSalario(e1);
    }
}
