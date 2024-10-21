
package interfaceTecnico;

/**
 *
 * @author 363707
 */
public class Cliente extends Pessoa{
    private Double horasGastas;
    private int qtdPaginaImpressa;
    private Internet internet;
    private Impressao impressao;

    public Double getHorasGastas() {
        return horasGastas;
    }

    public void setHorasGastas(Double horasGastas) {
        this.horasGastas = horasGastas;
    }

    public int getQtdPaginaImpressa() {
        return qtdPaginaImpressa;
    }

    public void setQtdPaginaImpressa(int qtdPaginaImpressa) {
        this.qtdPaginaImpressa = qtdPaginaImpressa;
    }

    public Internet getInternet() {
        return internet;
    }

    public void setInternet(Internet internet) {
        this.internet = internet;
    }

    public Impressao getImpressao() {
        return impressao;
    }

    public void setImpressao(Impressao impressao) {
        this.impressao = impressao;
    }
    
    public Cliente(Double horasGastas, int qtdPaginaImpressa, Internet internet, Impressao impressao){
        super();
    }
}
