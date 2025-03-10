/*4. Cálculo de Média Simples
Faça um programa que solicite ao usuário três notas
(valores decimais) e exiba a média aritmética delas.*/


package exercicio1.problema5;


import java.util.Scanner;


public class CalculoDia{
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

      System.out.println("Digite sua idade: ");
      int idade = entrada.nextInt();



    System.out.println("Sua idade em dias é: "+ idade*365);


    entrada.close();
  }
}
