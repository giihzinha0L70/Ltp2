
package classeAbstrataPessoa;

/**
 *
 * @author 363707
 */
public class Empregado extends Pessoa{
    private String matr;
    private String setor;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public Empregado(String nome, double gratificacao, double salario, Filiacao filiacao, String matr, String setor){
        super(nome, gratificacao, salario, filiacao);
        this.matr=matr;
        this.setor=setor;        
    }
    
    @Override
    public double salarioFinal(){
        return  (salario + gratificacao);
    }
    
    @Override
    public String toString(){
        return  "\n Dados do Professor:" + 
                "\n Nome:" + getNome()+
                "\n Dados da Filiação:" + getFiliacao()+
                "\n Matrícula:" + getMatr()+
                "\n Setor:" + getSetor()+
                "\n Valor do Sálario Final:" + salarioFinal();
    }
    
}
