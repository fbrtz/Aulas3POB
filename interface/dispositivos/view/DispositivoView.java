package view;

import controller.DispositivoController;
import model.*;

import java.util.Scanner;

public class DispositivoView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DispositivoController controller = new DispositivoController();

        System.out.println("Escolha o dispositivo:\n1 - Smartphone\n2 - Televisão");
        int opcao = sc.nextInt();

        IDispositivoEletronico dispositivo = null;

        switch (opcao) {
            case 1:
                dispositivo = new Smartphone();
                break;
            case 2:
                dispositivo = new Televisao();
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        controller.ativarDispositivo(dispositivo);
        controller.desativarDispositivo(dispositivo);
    }
}
