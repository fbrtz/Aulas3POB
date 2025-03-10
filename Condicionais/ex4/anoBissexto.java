package ex4;

import java.util.Scanner;

public class anoBissexto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int ano = sc.nextInt();

        if (ano%4 == 0){
            System.out.println("O ano "+ano+" é bissexto");
        }else{
            System.out.println("O ano "+ano+" não é bissexto");
        }
            
        sc.close();
    } 
}
