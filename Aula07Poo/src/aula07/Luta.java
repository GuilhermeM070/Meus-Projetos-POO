package aula07;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l0, Lutador l1){
        if(l0.getCategoria().equals (l1.getCategoria()) 
                && l0!=l1){
            this.aprovada=true;
            this.desafiado=l0;
            this.desafiante=l1;
        }else{
                this.aprovada=false;
                this.desafiado=null;
                this.desafiante=null;
                }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("===== RESULTADO =====");
            switch(vencedor){
                case 0: //Empate
                    System.out.println("Empate.");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Desafiado vence
                    System.out.println("Vitória do "+this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Desafiante vence
                    System.out.println("Vitória do "+this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        }else{
            System.out.println("A luta não acontecerá");
        }
        System.out.println("=====================");
    }

    
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador dfd) {
        this.desafiado = dfd;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador dft) {
        this.desafiante = dft;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rds) {
        this.rounds = rds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprvd) {
        this.aprovada = aprvd;
    }
}
