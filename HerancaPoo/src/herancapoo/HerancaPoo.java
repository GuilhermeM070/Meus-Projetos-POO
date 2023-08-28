package herancapoo;
public class HerancaPoo{
    public static void main(String[] args) {
        var visitante = new Visitante();
        var bolsista = new Bolsista();
        var aluno = new Aluno();
        var professor = new Professor();
        var tecnico = new Tecnico();
        
        aluno.setNome("Guilherme");
        aluno.setCurso("Engenharia da computação");
        bolsista.setMatricula(2525);
        bolsista.setNome("Guilherme");
        bolsista.setBolsa(25.6f);
        bolsista.setSexo("M");
        bolsista.pagarMensalidade();
    }
    
}
