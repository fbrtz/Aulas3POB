package ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaMedia {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);     
        double num,soma=0,media;
        int i=0;
        ArrayList<Double> numeros = new ArrayList<>();

        do { 
            System.out.print("Digite o "+i+" valor(-1 para sair): ");
            num = sc.nextDouble();
            numeros.add(num);
            i++;
        } while(num!=-1);
        //i=0;i<numeros.size();i++
        for(Double item : numeros){
            soma += item;
        }

        media = soma/i;
        System.out.println("\nSoma dos valores: "+soma);
        System.out.println("Média dos valores: "+media);

        sc.close();
    } 
}
