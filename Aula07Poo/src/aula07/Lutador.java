package aula07;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    

    public Lutador(String no, String na, int id, float al,
            float ps, int vit, int der, int emp) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(ps);
        this.vitorias = vit;
        this.derrotas = der;
        this.empates = emp;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int id) {
        this.idade = id;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float al) {
        this.altura = al;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float ps) {
        this.peso = ps;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(){
        if(this.peso<52.2){
            this.categoria="Abaixo do peso, não pode lutar.";       
        }else if(this.peso<=70.3){
            this.categoria="Peso Leve!!!";
        }else if(this.peso<=83.9){
            this.categoria="Peso Médio!!!";
        }else if(this.peso<=120.2){
            this.categoria="Peso Pesado!!!";
        }else{
            this.categoria="Inválido";
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vit) {
        this.vitorias = vit;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int der) {
        this.derrotas = der;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int emp) {
        this.empates = emp;
    }

    
    public void apresentar() {
        System.out.println("CHEGOU A HORA!!! IT´TIMEEEEEEEEE!!!! Se apresentando hoje. "+ this.getNome());
        System.out.println("Diretamente e lutando por "+this.getNacionalidade());
        System.out.println("Com "+this.getIdade()+" anos e "+this.altura);
        System.out.println("Pesando "+this.getPeso()+"Kg");
        System.out.println(this.getVitorias()+" Vitórias");
        System.out.println(this.getDerrotas()+" Derrotas");
        System.out.println(this.getEmpates()+" Empates");
    }
    public void status() {
        System.out.println("--------------- LUTADOR ---------------");
        System.out.println(this.getNome()+" é um "+this.getCategoria());
        System.out.println("Ganhou "+this.getVitorias()+" vezes");
        System.out.println("Perdeu "+this.getDerrotas()+" vezes");
        System.out.println("Empatou "+this.getEmpates()+" vezes");
    }
    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates()+1);
    }
}
