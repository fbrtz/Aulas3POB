package ex2;

import java.util.Scanner;

public class LeituraNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int i = 0;

        while (i < 5) {
            try {
                System.out.print("Digite um número inteiro (" + (i + 1) + "/5): ");
                numeros[i] = Integer.parseInt(scanner.nextLine());
                i++;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
            }
        }

        System.out.println("Números digitados:");
        for (int n : numeros) {
            System.out.println(n);
        }
    }
}