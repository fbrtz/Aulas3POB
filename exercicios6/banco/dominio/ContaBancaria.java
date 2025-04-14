package dominio;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void Depositar(double valordep) {
        if(valordep>0){
            saldo = saldo + valordep;
            System.out.println("Depósito bem sucedido!");
        }else{
            System.out.println("Valor inválido");
        }
    }

    public void Sacar(double valorsaq) {
        if(valorsaq>0 && valorsaq<=saldo){
            saldo = saldo - valorsaq;
            System.out.println("Saque bem sucedido!");
        }else{
            System.out.println("Valor inválido");
        }
    }

    public void ExibeSaldo() {
        System.out.println("\n\nTitular: "+titular);
        System.out.println("Saldo atual: " + saldo);
    }

    public String getTitular(){
       return titular;
    }

    public double getSaldo(){
        return saldo;
    }
}
