package dominio;

public class Elevador {
    private int andarAtual;
    private int totalAndares;

    public Elevador(int totalAndares) {
        this.andarAtual = 0; // térreo
        this.totalAndares = totalAndares;
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subiu para o andar " + andarAtual);
        } else {
            System.out.println("Já está no último andar.");
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Desceu para o andar " + andarAtual);
        } else {
            System.out.println("Já está no térreo.");
        }
    }

    public void exibirAndar() {
        if(andarAtual==0){
            System.out.println("Andar atual: Térreo");
        }else if(andarAtual== totalAndares){
            System.out.println("Andar atual: Cobertura");
        }else{
            System.out.println("Andar atual: " + andarAtual);    
        }
        
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }
}

