package exemplopoo;
public class Celular {
    public String modelo;
    public float tamanho;
    private boolean camera;
    protected String s_o;
    
    public Celular(String m, String s_o, float t){
        this.modelo = m;
        this.s_o = s_o;
        this.setTamanho(t);
        this.camera_fechada();
    }
    
    public void status(){
        System.out.println("O modelo do celular: " + this.modelo);
        System.out.println("Polegada: " + this.tamanho);
        System.out.println("Camera ligada: " + this.camera);
        System.out.println("O sistema operacional é: " + this.s_o);
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getTamanho(){
        return this.tamanho;
    }
    public void setTamanho(float t){
        this.tamanho = t;
    }
    public void camera_aberta(){
        this.camera = true;
    }
    public void camera_fechada(){
        this.camera = false;
    }
    public String getS_o(){
        return this.s_o;
    }
    public void setS_o(String s_o){
        this.s_o = s_o;
    }
}
