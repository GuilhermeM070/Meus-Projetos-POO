package campeonato;

import java.util.Random;

public class Jogo {
    private Times mandante;
    private Times visitante;
    private int tempo;
    private boolean apitoinicial;

    
    public void comecajogo(Times t0, Times t1){
        if(t0.getJogos() == (t1.getJogos()) 
            && t0!=t1){
            this.apitoinicial=true;
            this.mandante=t0;
            this.visitante=t1;
        }else{
            this.apitoinicial=false;
            this.mandante=null;
            this.visitante=null;
        }
    }
    
    public void jogoejogado(){
        if(this.apitoinicial){
            System.out.println("===== MANDANTE =====");
            this.mandante.apresentacao();
            System.out.println("===== VISITANTE =====");
            this.visitante.apresentacao();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("====== RESULTADO ======");
            switch (vencedor){
                case 0:
                    System.out.println("--- EMPATE ---");
                    this.mandante.empatouPontos();
                    this.visitante.empatouPontos();
                    break;
                case 1:
                    System.out.println("--- Vitória do "+this.mandante.getTimes()+"---");
                    this.mandante.ganhouPontos();
                    this.visitante.perdeuPontos();
                    break;
                case 2:
                    System.out.println("--- Vitória do "+this.visitante.getTimes()+"---");
                    this.mandante.perdeuPontos();
                    this.visitante.ganhouPontos();
                    break;
            }
        }else{
                    System.out.println("=== NÃO TIVEMOS LUTAS, VANDALIZARAM O BANHEIRO ===");
                    }
            System.out.println("==========================");
    }
    
    
    public Times getMandante() {

        return mandante;

    }
    public void setMandante(Times mandante) {

        this.mandante = mandante;

    }
    public Times getVisitante() {

        return visitante;

    }
    public void setVisitante(Times visitante) {

        this.visitante = visitante;

    }
    public int getTempo() {

        return tempo;

    }
    public void setTempo(int tempo) {

        this.tempo = tempo;

    }
    public boolean getApitoinicial() {

        return apitoinicial;

    }
    public void setApitoinicial(boolean apitoinicial) {

        this.apitoinicial = apitoinicial;

    }
}
