/*10. Distância Entre Dois Pontos
Desenvolva um programa que leia as coordenadas x1, y1 e x2, y2 
de dois pontos no plano cartesiano e calcule a distância entre eles.

Fórmula: D = sqrt((x2 - x1)² + (y2 - y1)²)*/

 

 package exercicio1.problema10;


 import java.util.Scanner;
 
 
 public class DistanciaPontos {
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

      System.out.println("Digite a coordenada x1: ");
      double x1 = entrada.nextDouble();

      System.out.println("Digite a coordenada y1: ");
      double y1 = entrada.nextDouble();

      System.out.println("Digite a coordenada x2: ");
      double x2 = entrada.nextDouble();

      System.out.println("Digite a coordenada y2: ");
      double y2 = entrada.nextDouble();

      double distancia = Math.pow(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
      
         
      System.out.println("A distância entre os pontos é de: " + distancia);

      entrada.close();
   }
}
