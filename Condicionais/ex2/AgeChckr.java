
package ex2;

import java.util.Scanner;


public class AgeChckr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();

		if (idade<18){
			System.out.println("Menor de idade");
		}else if (idade<=60){
			System.out.println("Entre 18 e 60 anos");
		}else{
			System.out.println("Mais de 60 anos");
		}
		sc.close();

		
	}
}