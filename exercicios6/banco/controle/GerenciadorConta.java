package controle;

import java.util.Scanner;
import dominio.ContaBancaria;

public class GerenciadorConta {
    public static ContaBancaria CadastrarConta(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome do Titular: ");
        String titular = sc.nextLine();

        ContaBancaria novaconta = new dominio.ContaBancaria(titular,0);
        
        return novaconta;
    }

    public static void main(String []args){
        int i=-1;
        double valor;
        ContaBancaria conta = null;
        Scanner sc = new Scanner(System.in);

        while(i!=0){
            System.out.println("\n\nMenu de Operações");
            System.out.println("1 - Cadastrar Conta");
            System.out.println("2 - Depositar valor");
            System.out.println("3 - Sacar valor");
            System.out.println("4 - Ver saldo");
            System.out.println("0 - Sair");
        

            System.out.print("Digite a operação desejada: ");
            i = sc.nextInt();
            System.out.println("\n");

            
            switch(i){
                case 1:
                    conta = CadastrarConta();
                    break;
                case 2:
                    System.out.print("Digite o valor depositado: ");
                    valor = sc.nextDouble();
                    conta.Depositar(valor);
                    break;
                case 3:
                    System.out.print("Digite o valor sacado: ");
                    valor = sc.nextDouble();
                    conta.Sacar(valor);
                    break;
                case 4:
                    conta.ExibeSaldo();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Nenhuma opção escolhida...");
                    break;
            }

        }


        sc.close();
    }
}
