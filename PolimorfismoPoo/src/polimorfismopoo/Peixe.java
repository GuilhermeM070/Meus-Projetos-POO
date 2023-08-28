package polimorfismopoo;
public class Peixe extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    private void soltarBolha(){
        System.out.println("Soltar bolhas.");    
    }
    
    @Override
    public void locomover(){
        System.out.println("Nadando.");
    }
    @Override
    public void emitirSom(){
        System.out.println("Não faz som.");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias.");
    }
}
