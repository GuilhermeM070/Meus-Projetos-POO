package campeonato;
public class Times implements Pontuacao{
    private String times;
    private int vitoria, derrotas, empates;
    private int pontos;
    private float tabela;
    private int jogos;

    public Times(String times, int vitoria, int derrotas, int empates, int pontos, int jogos) {
        this.times = times;
        this.vitoria = vitoria;
        this.derrotas = derrotas;
        this.empates = empates;
        this.pontos = pontos;
        this.jogos = jogos;
    }

    public int getJogos() {
        return jogos;
    }
    public void setJogos(int jogos) {
        this.jogos = jogos;
    }
    public float getTabela() {
        return tabela;
    }
    public void setTabela(float tabela) {
        this.tabela = tabela;
    }
    public String getTimes() {
        return times;
    }
    public void setTimes(String times) {
        this.times = times;
    }
    public int getPontos() {
        return pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    public int getVitoria() {
        return vitoria;
    }
    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentacao(){
        System.out.println("CHEGOU A HORA!!! IT´TIMEEEEEEEEE!!!! Jogando hoje. "+ this.getTimes());
        System.out.println(this.getVitoria()+" Vitórias");
        System.out.println(this.getDerrotas()+" Derrotas");
        System.out.println(this.getEmpates()+" Empates");
        System.out.println(this.getPontos()+" Pontos.");
    }
    
    public void status(){
        System.out.println("===== TIME =====");
        System.out.println(this.getTimes()+"\nvem de "+this.getVitoria()+" Vitórias, "+this.getDerrotas()+" Derrotas, "+this.getEmpates()+" Empates e "+this.getPontos()+" Pontos.");
    }
    @Override
    public void ganhouPontos() {
        this.setVitoria(this.getVitoria()+1);
        this.setPontos(this.getPontos()+3);
        System.out.println("Ganhou a partida e fez 3 pontos!");
    }
    @Override
    public void perdeuPontos() {
        this.setDerrotas(this.getDerrotas()+1);
        this.setPontos(this.getPontos()+0);
        System.out.println("Perdeu a partida e fez 0 ponto!");
    }
    @Override
    public void empatouPontos() {
        this.setEmpates(this.getEmpates()+1);
        this.setPontos(this.getPontos()+1);
        System.out.println("Empatou a partida e fez 1 ponto!");
    }
    public void classificacao(){
        System.out.println("=== CLASSIFICAÇÃO DOS TIMES NO CAMPEONATO ===");
        System.out.println(this.getTimes()+" está com "+this.getPontos());
    }
}
