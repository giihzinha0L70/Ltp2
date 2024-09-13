
package Modelo_SetorLoja;

/**
 *
 * @author 363707
 */
public class Box {
    private int numero;
    private String descricao;
    private Locatorio locatorio;
    private Produto produto;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Locatorio getLocatorio() {
        return locatorio;
    }

    public void setLocatorio(Locatorio locatorio) {
        this.locatorio = locatorio;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public Box(int numero, String descricao, Locatorio locatorio, Produto produto){
        this.numero=numero;
        this.descricao=descricao;
        this.locatorio=locatorio;
        this.produto=produto;
    }
    
    
    @Override
    public String toString(){
        return  "\n Número:" + getNumero()+
                "\n Descrição:" + getDescricao()+
                "\n Locatório:" + getLocatorio()+
                "\n Produto:" + getProduto();        
    }
    
}
