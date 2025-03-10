package ex3;

import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual operação deseja fazer?");
        System.out.println("( 1 ) Soma\n( 2 ) Subtração\n( 3 ) Multiplicação\n( 4 ) Divisão");

        int op = sc.nextInt();
        if (op<0 || op>4 ){
            System.out.println("Operação Inexsistes");
            System.exit(0);
        }
        System.out.println("Digite o valor do 1º número");
        int num1 = sc.nextInt();
        System.out.println("\nDigite o valor do 2º número");
        int num2 = sc.nextInt();

        int resultado = 0;
        switch(op){
            case 1:
                resultado = num1+num2;
            case 2:
                resultado = num1-num2;
            case 3:
                resultado = num1*num2;
            case 4:
                resultado = num1/num2;
        }

        System.out.println("O resultado é: "+resultado);

        sc.close();
    }   
}
