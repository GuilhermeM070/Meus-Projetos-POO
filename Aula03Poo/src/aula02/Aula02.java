package aula02;
public class Aula02 {
    public static void main(String[] args) {
        ControleTv ctv = new ControleTv();
        ctv.com_pilhas = false;
        ctv.botao_ligar_tv = true;
        ctv.status();
        ctv.assitir();
        ctv.usar_controle();
    }
    
}
