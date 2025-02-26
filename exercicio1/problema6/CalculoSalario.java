/*6. Cálculo do Salário
Escreva um programa que receba o salário bruto de um funcionário
 e o valor de desconto do INSS. 
 O programa deve calcular e exibir o salário líquido..*/


package exercicios1.problema6;


import java.util.Scanner;


public class CalculoSalario {
 public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o salário bruto: ");
    Float bruto = entrada.nextFloat();

    System.out.println("Digite a % de desconto do INSS: ");
    int inss = entrada.nextInt();

    float liquido = bruto - ((bruto*inss)/100);
        
    System.out.println("O salário líquido é: "+ liquido);


    entrada.close();
 }
}
