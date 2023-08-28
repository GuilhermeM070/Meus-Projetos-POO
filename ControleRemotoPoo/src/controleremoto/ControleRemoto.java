package controleremoto;
public class ControleRemoto {
    public static void main(String[] args) {
        Controlar cr = new Controlar();
        cr.ligar();
        cr.abrirMenu();
        cr.play();
        cr.maisVolume();
        cr.menosVolume();
    }
}
