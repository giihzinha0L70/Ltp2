
package Modelo_SetorLoja;

/**
 *
 * @author 363707
 */
public class Locatorio {
    private String codigo;
    private String nome;
    private Contrato contrato;
    private Endereco endereco;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Locatorio(String codigo, String nome, Contrato contrato, Endereco endereco){
        this.codigo=codigo;
        this.nome=nome;
        this.contrato=contrato;
        this.endereco=endereco;
    }
    
    @Override
    public String toString(){
        return  "\n Código:" + getCodigo()+
                "\n Nome:" + getNome()+
                "\n Contrato:" + getContrato()+
                "\n Endereço:" + getEndereco();
    }
}
