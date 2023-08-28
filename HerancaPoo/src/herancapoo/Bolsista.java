package herancapoo;
public class Bolsista extends Aluno{
    private float Bolsa;
    
    public void RenovarBolsa(){
        System.out.println("Renovando bolsa");
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome()+" é bolsista! Pagamento facilitado. ");
    }
    
    public float getBolsa() {
        return Bolsa;
    }
    public void setBolsa(float Bolsa) {
        this.Bolsa = Bolsa;
    }
    
    
}
