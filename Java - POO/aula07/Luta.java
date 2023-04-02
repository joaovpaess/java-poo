package aula07;

import java.util.Random;

public class Luta 
{
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //Métodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    //Métodos Públicos
    public void marcarLuta(Lutador l01, Lutador l02)
    {
        if(l01.getCategoria().equals(l02.getCategoria()) && l01 != l02)
            {
            this.aprovada = true;
            this.desafiado = l01;
            this.desafiante = l02;
            }
        else
        {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar()
    {
        if(this.aprovada)
        {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2
            switch (vencedor)
            {
                case 1: //Empate
                System.out.println("Empatou!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;

                case 2: //Ganhou Desafiado
                System.out.println(desafiado.getNome() + " ganhou!");
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;

                case 3: //Ganhou desafiante
                System.out.println(desafiante.getNome() + " ganhou!");
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                break;
            }
        }
        else
            System.out.println("Luta não pode acontecer.");
        
    }
}
