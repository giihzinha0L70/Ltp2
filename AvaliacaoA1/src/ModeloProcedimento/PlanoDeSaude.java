
package ModeloProcedimento;

/**
 *
 * @author yurif
 */
public class PlanoDeSaude {
    private String cnpj;
    private String nome;
    private String contato;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    public PlanoDeSaude(String cnpj, String nome, String contato){
        this.cnpj=cnpj;
        this.nome=nome;
        this.contato=contato;
    }
    
    @Override
    public String toString(){
        return  "\n CNPJ:" + getCnpj()+
                "\n Nome:" + getNome()+
                "\n Contato:" + getContato();
    }
}
