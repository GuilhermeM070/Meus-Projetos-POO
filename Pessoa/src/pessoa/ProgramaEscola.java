package pessoa;
public class ProgramaEscola {
    public static void main(String[] args) {
       Pessoa p = new Pessoa(); 
       Aluno a = new Aluno();
       Funcionario f = new Funcionario();
       Professor pr = new Professor();
       
       p.setNome("Pedro");
       a.setNome("Maria");
       f.setNome("Claúdio");
       pr.setNome("Fabiana");
       
       p.setIdade(25);
       a.setIdade(27);
       f.setIdade(36);
       pr.setIdade(48);
       
       p.setSexo("M");
       a.setSexo("F");
       f.setSexo("M");
       pr.setSexo("F");
       
       a.setCurso("Programação");
       f.setSetor("Comercio");
       pr.setSalario(25000f);
       
       pr.receberAum(3000f);
       f.mudarTrabalho();
       
       System.out.println(p.toString());
       System.out.println(a.toString());
       System.out.println(f.toString());
       System.out.println(pr.toString());
    }
}
