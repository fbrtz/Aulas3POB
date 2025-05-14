package domain;

public class Professor extends Pessoa{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    @Override
    public void exibirDados(){
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Salário: "+salario);
    }

}
