package ex5;

import java.util.Scanner;

public class BuscaElemento {
    public static void main(String []args){
        int busca,tam=10,lista[],media=0;
        lista = new int[tam];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<tam;i++){
            System.out.print("Digite o "+(i+1)+"o número: ");
            lista[i] = sc.nextInt();
        }
        
        System.out.print("\nDigite o número que deseja buscar: ");
        busca = sc.nextInt();


        for(int i=0;i<tam;i++){
            if(lista[i]==busca){
                System.out.println("O número foi encontrado na posição "+i);
            }
        }
        sc.close();
    }
}
