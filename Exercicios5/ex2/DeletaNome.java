package ex2;

import java.util.Scanner;
import java.util.ArrayList;

public class DeletaNome{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String nome,deleted;
        boolean ok=false;
        int i=1,j=0;
        ArrayList<String> nomes = new ArrayList<>();


        do { 
            System.out.print("Digite o "+i+"o nome: ");
            nome = sc.nextLine();
            nomes.add(nome);
            i++;
            sc.nextLine();
        } while(i<=5);


        System.out.print("Digite o nome a ser removido: ");
        deleted = sc.nextLine();

        for(String item : nomes){
            
            if(item.equalsIgnoreCase(deleted)){
                nomes.remove(j);
                ok = true;
            }
            j++;
        }


        if(ok){
            System.out.println("Todas ocorrências do nome foram removidas");
        }else{
            System.out.println("Não foram encontradas nenhuma ocorrência do nome");
        }

        System.out.println(nomes);

        sc.close();
    }
}