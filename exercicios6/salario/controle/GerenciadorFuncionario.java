package controle;

import java.util.Scanner;
import dominio.Funcionario;

public class GerenciadorFuncionario {

    public static Funcionario CadastrarFuncionario(){
        Scanner sc =  new Scanner(System.in);
        String nome,categoria;
        double salariobase;
        System.out.println("Cadastro de funcionario============");
        System.out.print("\nNome do funcionário: ");
        nome = sc.nextLine();
        System.out.print("\nSalário base: ");
        salariobase=sc.nextDouble();
        sc.nextLine();
        System.out.print("\nCategoria: ");
        categoria = sc.nextLine();

        

        Funcionario func = new dominio.Funcionario(nome,salariobase,categoria);
        

        return func; 
    }

    public static void main(String[] args) {
        int i=-1;
        Funcionario f = null;

        Scanner sc = new Scanner(System.in);
        while(i!=0){
            System.out.println("\nEscolha uma opção");
            System.out.println("1 - Cadastrar um funcionário");
            System.out.println("2 - Calcular Salário Final");
            System.out.println("0 - Sair");


            System.out.print("Opção: ");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    f = CadastrarFuncionario();
                    break;
                case 2:
                     f.calcularSalarioFinal();
                    break;
                case 0:
                    System.out.println("Programa encerrado. . .");
                    return;
                default:
                    System.out.println("Opção inválida");;
            }
        }

        sc.close();
    }
}
