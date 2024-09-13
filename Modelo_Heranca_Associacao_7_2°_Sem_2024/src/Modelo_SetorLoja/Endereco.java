
package Modelo_SetorLoja;

/**
 *
 * @author 363707
 */
public class Endereco {
    private String rua;
    private String numero;
    private String cep;
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public Endereco(String rua, String numero, String cep){
        this.rua=rua;
        this.numero=numero;
        this.cep=cep;
    }
    
    @Override
    public String toString(){
        return  "\n Rua:" + getRua()+
                "\n Número da casa:" + getNumero()+
                "\n CEP:" + getCep();
    }
    
}
