package aula04poo;
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean Tampada;
    public String Cor;
    
    
    public Caneta(String m, String c, float p){
        this.tampar();
        this.modelo = m;
        this.setPonta(p);
        this.Cor = "Azul";
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar(){
        this.Tampada = true;
    }
    public void destampar(){
        this.Tampada = false;
    }
    
    public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("O modelo da caneta é: " + this.getModelo());
        System.out.println("O calibre da ponta da caneta é: " + this.getPonta());
        System.out.println("A cor da caneta é: " + this.Cor);
        System.out.println("Tampada: " + this.Tampada);
    }
}
