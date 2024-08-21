
package Livro;

/**
 *
 * @author 363707
 */
public class Edicao {
    private int numero;
    private int ano;
    private Patrocinador patrocinador;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Patrocinador getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(Patrocinador patrocinador) {
        this.patrocinador = patrocinador;
    }
    
    public Edicao(int numero, int ano, Patrocinador patrocinador){
        this.numero=numero;
        this.ano=ano;
        this.patrocinador=patrocinador;
    }
    
    @Override
    public String toString(){
        return  "\n Número:" + getNumero()+
                "\n Ano:" + getAno()+
                "\n Patrocinador:" + getPatrocinador();
        
    }
}
