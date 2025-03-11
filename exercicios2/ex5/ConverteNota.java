package ex5;

import java.util.Scanner;

public class ConverteNota {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Digite a nota do aluno: ");
            float nota = sc.nextFloat();
            char conceito;

            switch ((int)nota) {
                case 9:
                case 10:
                    conceito = 'A';
                    break;
                case 7:
                case 8:
                    conceito = 'B';
                    break;
                case 5:
                case 6:
                    conceito = 'C';
                    break;
                case 3:
                case 4:
                    conceito = 'D';
                    break;
                case 0:
                case 1:
                case 2:
                    conceito = 'E';
                    break;
                default:
                    conceito = ' ';
                    break;
            }
            System.out.println("O conceito do aluno é: "+conceito);

            sc.close();
    }
}
