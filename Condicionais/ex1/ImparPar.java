
package ex1;

import java.util.Scanner;

public class ImparPar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        int numero = sc.nextInt();
        
        if (numero%2 == 0){
            System.out.println("È par!!!!!!!!!!!");
            
        }else{
            System.out.println("Não é par!!!!!!!!");
        }


        sc.close();

    }

}