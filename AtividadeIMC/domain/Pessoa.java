package domain;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura, peso;
    private String sexo;

    public Pessoa(String nome, int idade, double altura, double peso, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public void listarPessoa() {
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Altura: "+altura);
        System.out.println("Peso: "+peso);
        System.out.println("Sexo: "+sexo);
    }

    public double calcularIMC() {
        return (peso/(altura*altura));
    }

    public String resultIMC(){
        double imc = calcularIMC();

        if(imc<18.5){
            return "Magreza";
        }
        if(imc<=24.9){
            return "Peso normal";
        }
        if(imc<=29.9){
            return "Excesso de peso";
        }
        
        if(imc<35){
            return "Obesidade Classe I";
        }

        return "Obesidade Classe II";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}