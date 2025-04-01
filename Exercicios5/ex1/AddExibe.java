package ex1;

import java.util.Scanner;
import java.util.ArrayList;

public class AddExibe{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String sair;
        int num,i=1;
        ArrayList<Integer> numeros = new ArrayList<>();


        do { 
            System.out.print("Digite o "+i+" valor: ");
            num = sc.nextInt();
            numeros.add(num);
            i++;

            sc.nextLine();
            System.out.println("Deseja continuar? Y/N");
            sair = sc.nextLine();
        } while(sair.equalsIgnoreCase("y"));
        //i=0;i<numeros.size();i++
        for(int item : numeros){
            System.out.print(item+" ");
        }

        sc.close();
    }
}