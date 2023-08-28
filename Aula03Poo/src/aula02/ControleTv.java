package aula02;
public class ControleTv {
    public String modelo;
    public String cor;
    public float n_de_botoes;
    private int carga;
    protected boolean com_pilhas;
    protected boolean botao_ligar_tv;
    
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Número de botões: " + this.n_de_botoes);
        System.out.println("Carga da bateria: " + this.carga);
        System.out.println("Com pilhas: " + this.com_pilhas);
        System.out.println("Ligar TV: " + this.botao_ligar_tv);
    }
    
    public void usar_controle(){
        if(this.com_pilhas == true){
            System.out.println("Pode ligar a Tv.");
    }else {
            System.out.println("Coloque pilhas no controle da TV.");
        }
    }
    protected void assitir(){
        if(this.botao_ligar_tv == true){
            System.out.println("Tv ligada.");
    }else{
            System.out.println("Tv Desligada.");
        }
    }
}
