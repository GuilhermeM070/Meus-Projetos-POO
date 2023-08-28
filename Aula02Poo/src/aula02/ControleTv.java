package aula02;
public class ControleTv {
    String modelo;
    String cor;
    float n_de_botoes;
    int carga;
    boolean com_pilhas;
    boolean ligar_tv;
    
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Número de botões: " + this.n_de_botoes);
        System.out.println("Carga da bateria: " + this.carga);
        System.out.println("Com pilhas: " + this.com_pilhas);
        System.out.println("Ligar TV: " + this.ligar_tv);
    }
    
    void usar_controle(){
        if(this.com_pilhas == true){
            System.out.println("Pode usar o controle da Tv.");
        }else {
            System.out.println("Coloque pilhas no controle da TV.");
        }
    }
    
    void assistir(){
        if(this.ligar_tv == true){
            System.out.println("TV ligada, pode aumentar o volume ou trocar de canal.");
        }else {
            System.out.println("Tv desligada.");
        }
    }
    
    void volume_tv (){
       if(this.com_pilhas == true){
           System.out.println("Pode aumentar o volume da Tv.");
       } else {
           System.out.println("Não é possivel, Tv desligada ou controle sem pilhas.");
       }
    }
}
