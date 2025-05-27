package ex1;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = Double.parseDouble(scanner.nextLine());
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Digite um número válido.");
        }
    }
}