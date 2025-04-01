package ex4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Contagem{
    public static void main(String []args){
        int i=0,numero,cont=0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        do{
            System.out.print("\nInsira o "+(i+1)+"º valor: ");
            numero = sc.nextInt();

            numeros.add(numero);
            sc.nextLine();
            i++;

        }while(i<9);
        
        System.out.print("\nVAlor à ser pesquisado: ");
        numero = sc.nextInt();

        for(int item : numeros){
            if(item == numero){
                cont++;
            }
        }

        System.out.println("\n\nTotal de ocorrências do número "+numero+": "+cont+" vez(es).");

        sc.close();
    }
}