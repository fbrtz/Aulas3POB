
package ex1;

import java.util.Scanner;

public class SomaNaturais{
    
    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        int soma=0;
        System.out.print("Digite um valor limite: ");
        int numero = sc.nextInt();

        
        for(int i=0;i<=numero;i++){
            soma+=i;
        }
        
        System.out.print("\nSoma dos N numeros: "+soma);
        sc.close();
    }

}