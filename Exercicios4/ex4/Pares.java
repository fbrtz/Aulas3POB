package ex4;

import java.util.Scanner;

public class Pares {
    public static void main(String []args){
        int tam=8, lista[],cont=0;
        lista = new int[tam];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<tam;i++){
            System.out.print("Digite o "+(i+1)+"o número: ");
            lista[i] = sc.nextInt();
        }

        for(int i=0;i<tam;i++){
            if(lista[i]%2==0){
                cont++;
            }
        }
        
        System.out.println("Total de números pares: "+cont);
        sc.close();
    }
}
