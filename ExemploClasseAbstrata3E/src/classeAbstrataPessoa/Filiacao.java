
package classeAbstrataPessoa;

/**
 *
 * @author 363707
 */
public class Filiacao {
    private String nomePai;
    private String nomeMae;

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
    
    public Filiacao(String nomePai, String nomeMae){
        this.nomePai=nomePai;
        this.nomeMae=nomeMae;
    }
    
    @Override
    public String toString(){
        return  "\n Nome do Pai:" + getNomePai()+
                "\n Nome da Mãe:" + getNomeMae();
    }
}
