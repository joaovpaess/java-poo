package aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " +this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    public void escrever(){
        if(tampada == false){
            System.out.println("Estou escrevendo.");
        }
        else{
            System.out.println("Destampe a caneta!");
        }

    }
    public void rabiscar(){
        if(tampada == false){
            System.out.println("Estou rasbicando.");
        }
        else{
            System.out.println("Destampe a caneta!");
        }
 
    }
    public void pintar(){
        if(tampada == false){
            System.out.println("Estou pintando.");
        }
        else{
            System.out.println("Destampe a caneta!");
        }
    }
    public void tampar(){
        this.tampada = true;
        System.out.println("A caneta está tampada.");
    }
    public void destampar(){
        this.tampada = false;
        System.out.println("A caneta está destampada.");
    }

}
