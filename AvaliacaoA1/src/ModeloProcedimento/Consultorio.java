
package ModeloProcedimento;

/**
 *
 * @author yurif
 */
public class Consultorio {
    private int numero;
    private String localizacao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public Consultorio(int numero, String localizacao){
        this.numero=numero;
        this.localizacao=localizacao;
    }
    
    @Override
    public String toString(){
        return  "\n Número:" + getNumero()+
                "\n Localização:" + getLocalizacao();
    }
}
