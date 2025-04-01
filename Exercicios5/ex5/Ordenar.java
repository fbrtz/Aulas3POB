package ex5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ordenar{
    public static void main(String []args){
        String sair="N";
        int i=0,numero;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        do{
            System.out.print("\nInsira o "+(i+1)+"º valor: ");
            numero = sc.nextInt();

            numeros.add(numero);
            sc.nextLine();
            i++;
            System.out.println("\n\nDeseja continuar?");
            sair = sc.nextLine();

        }while(sair.equalsIgnoreCase("y"));

        Collections.sort(numeros);

        for (int item : numeros){
            System.out.print(item+" ");
        }
        sc.close();
    }
}