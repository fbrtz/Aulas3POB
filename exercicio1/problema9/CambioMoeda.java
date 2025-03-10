/*Faça um programa que leia um valor em reais (R$)
 e a cotação do dólar no dia. 
 O programa deve calcular e exibir o valor equivalente em dólares (US$). */

 

 package exercicio1.problema9;


 import java.util.Scanner;
 
 
 public class CambioMoeda {
  public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
 
     System.out.println("Digite quanto possui em BRL: ");
     float brl = entrada.nextFloat();
 
     System.out.println("A cotação do USD hoje: ");
     float usd = entrada.nextFloat();
 
     float convertido = brl/usd;
     
         
     System.out.println("Você possui"+ convertido +" dólares.");
 
     entrada.close();
  }
}
