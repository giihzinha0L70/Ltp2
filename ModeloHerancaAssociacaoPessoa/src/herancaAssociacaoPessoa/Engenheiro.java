
package herancaAssociacaoPessoa;

/**
 *
 * @author 363707
 */
public class Engenheiro extends Pessoa{
    private String CREA;
    private Obra obra;

    public String getCREA() {
        return CREA;
    }

    public void setCREA(String CREA) {
        this.CREA = CREA;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }
    
    public Engenheiro(String nome, String CREA, Obra obra){
        super(nome);
        this.CREA=CREA;
        this.obra=obra;
    }
    
    @Override
    public String toString(){
        return  "\n Nome:" + getNome()+
                "\n CREA:" + getCREA()+
                "\n Obra:" + getObra();
    }
}
