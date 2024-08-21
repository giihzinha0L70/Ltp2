
package Funcionario;

/**
 *
 * @author 363707
 */
public class Porta {
    private Double largura;
    private Double altura;

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    public Porta(Double largura, Double altura){
        this.largura=largura;
        this.altura=altura;        
    }
    
    @Override
    public String toString(){
        return "\n Largura:" + getLargura()+
                "\n Altura:" + getAltura();
        
    }
}
