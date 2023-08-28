package polimorfismopoo;
public class Ave extends Animal{
    private String corPena;

    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    @Override
    public void locomover(){
        System.out.println("Voando.");
    }
    @Override
    public void emitirSom(){
        System.out.println("Emitindo som de aves.");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo frutas.");
    }
    
    public void fazerNinho(){
        System.out.println("fazendo o ninho.");
    }
}
