package ex1;

import java.util.Scanner;

public class MaiorMenor{
    public static void main(String []args){
        int menor=Integer.MAX_VALUE,maior=Integer.MIN_VALUE,lista[];
        lista = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.print("Digite o "+(i+1)+"o valor: ");
            lista[i] = sc.nextInt();
        }

        for(int i=0;i<5;i++){
            if(lista[i]>maior){
                maior = lista[i];
            }

            if(lista[i]<menor){
                menor = lista[i];
            }
        }
        
        System.out.println("\nMaior: "+maior);
        System.out.println("Menor: "+menor);

        sc.close();
    }
}