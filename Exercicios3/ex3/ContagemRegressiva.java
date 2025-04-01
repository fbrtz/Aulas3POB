package ex3;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int numero = sc.nextInt();

        do{
            System.out.println(numero);
            numero -= 1;
        }while(numero>=0);

    }
}
