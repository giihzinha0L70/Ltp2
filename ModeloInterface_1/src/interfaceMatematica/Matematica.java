
package interfaceMatematica;

/**
 *
 * @author 363707
 */
public class Matematica extends Disciplina{
    private Double cargaHoraria;
    private AplicacaoPratica aplicacaoPratica;

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public AplicacaoPratica getAplicacaoPratica() {
        return aplicacaoPratica;
    }

    public void setAplicacaoPratica(AplicacaoPratica aplicacaoPratica) {
        this.aplicacaoPratica = aplicacaoPratica;
    }
    
    public Matematica(String nome, Double cargaHoraria, AplicacaoPratica aplicacaoPratica){
        super(nome);
        this.cargaHoraria=cargaHoraria;
        this.aplicacaoPratica=aplicacaoPratica;
    }
    
    @Override
    public String toString(){
        return  "\nNome:"+ getNome()+
                "\nCarga Horária:"+ getCargaHoraria()+
                "\nAplicação Prática:"+ getAplicacaoPratica();
    }
}
