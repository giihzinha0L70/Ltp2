
package interfaceMatematica;

/**
 *
 * @author 363707
 */
public class Quadrado extends FiguraGeometrica implements ObjetoGeometrico{
    private Double lado;

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
    
    public Quadrado(String nome, Double lado){
        super(nome);
        this.lado=lado;        
    }
    
    @Override
    public Double calculaArea(){
        return(lado * lado);
    }
    
    @Override
     public Double calculaPerimetro(){
        return((4 * lado));
    }
     
    @Override
     public String toString(){
         return  "\nNome:" + getNome()+
                 "\nLado:" + getLado();
     }
}