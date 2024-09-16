
package classeAbstrataPessoa;

/**
 *
 * @author 363707
 */
public class Professor extends Pessoa{
    private String titulo;
    private String areaAtuacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    
    public Professor(String nome, double gratificacao, double salario, Filiacao filiacao, String titulo, String areaAtuacao){
        super(nome, gratificacao, salario, filiacao);
        this.titulo=titulo;
        this.areaAtuacao=areaAtuacao;
    }
    
    @Override
    public double salarioFinal(){
        return  (salario + (salario * 0.1)+gratificacao);
    }
    
    @Override
    public String toString(){
        return  "\n Dados do Professor:" + 
                "\n Nome:" + getNome()+
                "\n Dados da Filiação:" + getFiliacao()+
                "\n Área de Atuação:" + getAreaAtuacao()+
                "\n Salário:" + getSalario() +
                "\n Gratificação:" + getGratificacao()+
                "\n Título:" + getTitulo()+
                "\n Valor do Sálario Final:" + salarioFinal();
    }
}
