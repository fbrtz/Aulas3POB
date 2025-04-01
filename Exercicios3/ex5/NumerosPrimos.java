package ex5;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        int cont=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Início: ");
        int inicio = sc.nextInt();

        System.out.print("Final: ");
        int fim = sc.nextInt();

        for(int i=inicio+1;i<fim;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    cont+=1;
                }
            }
            if(cont==2){
                System.out.println(i+" é primo!");
            }
            cont=0;
        }

        sc.close();


    }
}
