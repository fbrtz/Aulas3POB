package ex2;

import java.util.Scanner;

public class Media {
    public static void main(String []args){
        int tam=4;
        float notas[],media=0;
        notas = new float[tam];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<tam;i++){
            System.out.print("Digite o "+(i+1)+"a nota: ");
            notas[i] = sc.nextFloat();
        }

        for(int i=0;i<tam;i++){
            media +=notas[i];
        }
        media = media/tam;

        if(media >=7){
            System.out.println("Aluno está aprovado!");
        }else{
            System.out.println("Aluno está reprovado");
        }
        sc.close();
    }
}