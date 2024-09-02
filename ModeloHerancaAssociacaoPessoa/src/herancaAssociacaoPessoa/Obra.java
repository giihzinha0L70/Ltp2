
package herancaAssociacaoPessoa;

/**
 *
 * @author 363707
 */
public class Obra {
    private String descricao;
    private String endereco;
    private Material material;
    private Cliente cliente;
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Obra(String descricao, String endereco, Material material, Cliente cliente){
        this.descricao=descricao;
        this.endereco=endereco;
        this.material=material;
        this.cliente=cliente;
    }
    
    @Override
    public String toString(){
        return  "\n Descrição:" + getDescricao()+
                "\n Endereço:" + getEndereco()+
                "\n Material:" + getMaterial()+
                "\n Cliente:" + getCliente();
    }    

}
