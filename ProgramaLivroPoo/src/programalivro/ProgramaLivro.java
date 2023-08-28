package programalivro;
public class ProgramaLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[6];
        
        p[0] = new Pessoa("Guilherme", 23, "M");
        p[1] = new Pessoa("Aguinaldo", 21, "M");
        
        l[0] = new Livro("A teoria de tudo", 
                "Stephen Hawking", 
                500, 0, true, p[0]);
        l[1] = new Livro("A Bíblia", 
                "Vários Autores", 
                500, 0, true, p[1]);
        l[2] = new Livro("As cavernas de aço", 
                "Isaac Asimov", 
                340, 0, true, p[1]);
        l[3] = new Livro("O sol desvelado", 
                "Isaac Asimov",
                420, 20, true, p[0]);
        l[4] = new Livro("Os robos da alvorada", 
                "Isaac Asimov", 450,
                250, true, p[0]);
        l[5] = new Livro("Robos e Imperio", 
                "Isaac Asimov", 
                523, 15, true, p[0]);
        
        l[5].abrir();
        l[5].folhear(500);
        l[5].avancarPag();
        
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
        System.out.println(l[3].detalhes());
        System.out.println(l[4].detalhes());
        System.out.println(l[5].detalhes());
    }
}
