/*7. Cálculo do Perímetro e Área de um Retângulo
Faça um programa que solicite a base e a altura de um retângulo e exiba o seu perímetro e sua área.

Fórmulas:

Área = base × altura

Perímetro = 2 × (base + altura).*/


 package exercicios1.problema7;


 import java.util.Scanner;
 
 
 public class PerimetroAreaRetangulo {
  public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
 
     System.out.println("Digite o comprimento da base: ");
     float base = entrada.nextFloat();
 
     System.out.println("Digite a altura: ");
     float altura = entrada.nextFloat();
 
     float area = base*altura;
     float perimetro = (base*2) + (altura*2);
         
     System.out.println("Área: "+area);
     System.out.println("Perímetro: "+perimetro);
 
     entrada.close();
  }
 }
 