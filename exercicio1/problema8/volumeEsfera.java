/*8. Cálculo do Volume de uma Esfera
Crie um programa que leia o raio de uma esfera e calcule o seu volume.

Fórmula: V = (4/3) * π * raio³.

Use π = 3.14159. */


package exercicio1.problema8;


import java.util.Scanner;


public class VolumeEsfera {
 public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o raio: ");
    float raio = entrada.nextFloat();

    double pi = 3.14159;

    float volume = (4/3) * pi * Math.pow(raio, 3);
    
    System.out.println("Volume da esfera:"+ volume);

    entrada.close();
 }
