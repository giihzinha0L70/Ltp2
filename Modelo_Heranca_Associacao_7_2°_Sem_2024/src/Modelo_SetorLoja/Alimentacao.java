package Modelo_SetorLoja;

/**
 *
 * @author 363707
 */
public class Alimentacao extends Setor{
    private int quantidadeLoja;

    public int getQuantidadeLoja() {
        return quantidadeLoja;
    }

    public void setQuantidadeLoja(int quantidadeLoja) {
        this.quantidadeLoja = quantidadeLoja;
    }
    
    public Alimentacao(int numero, int quantidadeLoja){
        super(numero);
        this.quantidadeLoja=quantidadeLoja;
    }
    @Override
    public String toString(){
        return  "\n Número:" + getNumero()+
                "\n Quantidade de Lojas:" + getQuantidadeLoja();
    }
}
