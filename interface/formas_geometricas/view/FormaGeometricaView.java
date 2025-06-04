package view;

import controller.FormaGeometricaController;
import java.util.Scanner;
import model.*;

public class FormaGeometricaView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FormaGeometricaController controller = new FormaGeometricaController();

        System.out.print("Digite a largura do retângulo: ");
        double largura = sc.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();

        IFormaGeometrica retangulo = new Retangulo(largura, altura);
        controller.exibirResultados(retangulo);

        System.out.print("\nDigite o raio do círculo: ");
        double raio = sc.nextDouble();

        IFormaGeometrica circulo = new Circulo(raio);
        controller.exibirResultados(circulo);

        sc.close();
    }
}
