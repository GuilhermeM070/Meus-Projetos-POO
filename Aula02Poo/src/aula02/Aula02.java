package aula02;

public class Aula02 {
    
    public static void main(String[] args) {
        ControleTv ctv = new ControleTv();
        ctv.carga = 70;
        ctv.com_pilhas = false;
        ctv.cor = "Preto";
        ctv.n_de_botoes = 10;
        ctv.modelo = "Panasonic";
        ctv.ligar_tv = true;
        ctv.status();
        ctv.usar_controle();
        ctv.assistir();
        ctv.volume_tv();
    }
    
}
