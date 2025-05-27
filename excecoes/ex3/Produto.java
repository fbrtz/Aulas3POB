package ex3;

// Classe de exceção personalizada
class PrecoInvalidoException extends Exception {
    public PrecoInvalidoException(String mensagem) {
        super(mensagem);
    }
}

// Classe Produto
class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) throws PrecoInvalidoException {
        if (preco <= 0) {
            throw new PrecoInvalidoException("Preço inválido: deve ser maior que zero.");
        }
        this.nome = nome;
        this.preco = preco;
    }

    public void exibir() {
        System.out.println("Produto: " + nome + ", Preço: R$ " + preco);
    }
}

// Programa principal
import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nome do produto: ");
            String nome = scanner.nextLine();
            System.out.print("Preço do produto: ");
            double preco = Double.parseDouble(scanner.nextLine());

            Produto produto = new Produto(nome, preco);
            produto.exibir();

        } catch (PrecoInvalidoException e) {
            System.out.println("Erro ao cadastrar produto: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro: o preço deve ser um número.");
        }
    }
}