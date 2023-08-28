package controleremoto;
public class Controlar implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean reproduzindo;
    //Métodos Especiais
    public Controlar() {
        this.volume = 15;
        this.ligado = false;
        this.reproduzindo = false;
    }

    private int getVolume() {
        return volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private boolean getTocando() {
        return reproduzindo;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private void setTocando(boolean r) {
        this.reproduzindo = r;
    }
    //Métodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
        this.setTocando(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        this.setTocando(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("------ MENU ------");
        System.out.println("Está ligado? "+this.getLigado());
        System.out.println("Está tocando? "+this.getTocando());
        System.out.print("Volume: "+this.getVolume());
        for(int i=0; i<=this.getVolume(); i+=10){
            System.out.print("||");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()+3);
        }else{
            System.out.println("Impossível aumentar volume.");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()-3);
        }else{
            System.out.println("Impossível diminuir volume.");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && !(this.getVolume()>0)){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(15);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && (this.getTocando())){
            this.setTocando(false);
        }
    }
}
