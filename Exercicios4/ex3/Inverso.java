package ex3;

import java.util.Scanner;

public class Inverso {
    public static void main(String []args){
        int tam=6;
        int lista[];
        lista = new int[tam];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<tam;i++){
            System.out.print("Digite o "+(i+1)+"o valor: ");
            lista[i] = sc.nextInt();
        }
        System.out.println("");
        for(int i=tam-1;i>=10;i--){
            System.out.print(lista[i]+" ");
        }
        sc.close();
    }
}
