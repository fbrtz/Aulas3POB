package controller;
import model.Produtos;
import java.util.ArrayList;


public class Produtos_Controller {
    
    private Produtos produto;
    private ArrayList<Produtos> produtos = new ArrayList<>();
    
    public void adicionarProduto(int id, String nome, int qtd){
        produto = new Produtos(id, nome, qtd);
            
        produtos.add(produto);
    }
    public void alterarProdutoPorID(int id, int nome, int qtd){
        
    }
    public void removerProdutoPorID(int id){
        produto = buscarProdutoPorID(id);

        if (produto != null){
            produtos.remove(produto);
            System.out.println("Produto com ID: "+id+" foi removido com sucesso!");
        }else{
            System.out.println("Produto com ID: "+id+" não foi encontrado!");  
        }
    }

    private Produtos buscarProdutoPorID(int id){
        Produtos achou = produtos.stream()
                    .filter(a -> a.getId() == id)
                    .findFirst()
                    .orElse(null);

        return achou;
    }

        

}
