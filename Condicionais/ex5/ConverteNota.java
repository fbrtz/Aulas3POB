package ex5;

import java.util.Scanner;

public class ConverteNota {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Digite a nota do aluno: ");
            float nota = sc.nextFloat();

                if (nota>0 && nota<=2){
                    System.out.println("O conceito dessa nota é: E");
                }else{
                    if (nota<5){
                        System.out.println("O conceito dessa nota é: D");
                    }else{
                        if (nota<6){
                            System.out.println("O conceito dessa nota é: C");
                    }else{
                        if (nota<8){
                            System.out.println("O conceito dessa nota é: B");
                    }else{
                        System.out.println("O conceito dessa nota é: A");
                    }
                }

            }    
        }
    }
}
