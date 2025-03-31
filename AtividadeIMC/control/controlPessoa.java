package control;

import java.util.Scanner;

import domain.Pessoa;

public class controlPessoa {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("\nIdade: ");
        int idade = sc.nextInt();

        System.out.print("\nAltura: ");
        double altura = sc.nextDouble();
        
        System.out.print("\nPeso: ");
        double peso = sc.nextDouble();

        sc.nextLine();
        
        System.out.print("\nSexo: ");
        String sexo = sc.nextLine();

        Pessoa p = new Pessoa(nome, idade, altura, peso, sexo);

        String resultado = p.resultIMC();

        System.out.println("\nResultado do IMC: "+resultado);

        sc.close();
    
    }
}
