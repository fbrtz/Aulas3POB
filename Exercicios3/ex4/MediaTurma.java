
package ex4;

import java.util.Scanner;

public class MediaTurma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota, somanota=0;
        System.out.print("Total de alunos: ");
        int total = sc.nextInt();

        for(int i = 1;i <= total; i++){
            
            System.out.print("\nDigite a "+i+"ª nota: ");
            nota = sc.nextFloat();

            somanota += nota;
        }

        System.out.println("\nMédia da turma: "+(somanota/total));
    }
}
