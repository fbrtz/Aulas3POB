package dominio;


public class Funcionario{
    private String nome;
    private double salariobase;
    private String categoria;

    public Funcionario(String nome, double salariobase, String categoria) {
        this.nome = nome;
        this.salariobase = salariobase;
        this.categoria = categoria;
    }

    public void calcularSalarioFinal(){
        double salariofinal;
        
        switch (categoria.toLowerCase()) {
            case "a":
                salariofinal = salariobase * 1.2;
                break;
            case "b":
                salariofinal = salariobase * 1.1;
                break;
            default:
                salariofinal = salariobase;
                break;
        }

        System.out.printf("Nome: %s\nSalário Final: %.2f\n", nome, salariofinal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    
}