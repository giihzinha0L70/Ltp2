
package interfaceTecnico;

/**
 *
 * @author 363707
 */
public class Internet extends Servico implements HoraExtra{
    private Double valorHora;

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
    
    public Internet(String nome, Double valorHora){
        super(nome);
        this.valorHora=valorHora;
    }
    
    @Override
    public String toString(){
        return  "\nNome:"+ getNome()+
                "\nValor por Hora:"+ getValorHora()+
                "\nQTDHORAEXTRA"+ QTDHORAEXTRA+
                "\nVALORHORAEXTRA"+ VALORHORAEXTRA;
    }
}
