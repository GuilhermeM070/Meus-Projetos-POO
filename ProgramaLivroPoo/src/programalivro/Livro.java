package programalivro;
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro{" + titulo + "\n-Autor = "+ autor +
                "\n-TotPáginas = "+ totPag+ "\n-PagAtual = "+ pagAtual+
                "\n-Aberto = "+aberto+"\n-Leitor = "+leitor.getNome()+
                "\n-Idade = "+leitor.getIdade()+
                "\n-Sexo = "+leitor.getSexo()+"}";
    }

    public Livro(String titulo, String autor, 
            int totPag, int pagAtual, boolean aberto, 
            Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.pagAtual = 0;
        this.aberto = true;
        this.leitor = leitor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotPag() {
        return totPag;
    }
    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    
    @Override
    public void abrir() {
        this.aberto=true;
    }

    @Override
    public void fechar() {
        this.aberto=false;
    }

    @Override
    public void folhear(int p) {
        if(p>this.totPag){
        this.pagAtual=0;    
        }else{
            this.pagAtual=p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
