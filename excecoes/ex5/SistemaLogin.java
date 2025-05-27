package ex5;

// Exceção personalizada
class LoginInvalidoException extends Exception {
    public LoginInvalidoException(String mensagem) {
        super(mensagem);
    }
}

// Programa principal
import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            if (usuario == null || usuario.trim().isEmpty() || senha == null || senha.trim().isEmpty()) {
                throw new LoginInvalidoException("Usuário e senha não podem estar vazios.");
            }

            System.out.println("Login efetuado com sucesso!");

        } catch (LoginInvalidoException e) {
            System.out.println("Erro de login: " + e.getMessage());
        }
    }
}