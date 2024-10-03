
package ModeloAuditoria;

/**
 *
 * @author 363707
 */
public class ParaPessoaFisica extends DeclaracaoImposto{
    private Double multa;
    private Dependente dependente;

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }
    
    public ParaPessoaFisica(int numero, int ano, Double valorDeclarado, Deducao deducao, Pagamento pagamento, Bens bens, Double multa, Dependente dependente){
        super(numero, ano, valorDeclarado, deducao, pagamento, bens);
        this.multa=multa;
        this.dependente=dependente;
    }
    
    public static Double calculaParcial(){
        return  (valorDeclarado + Bens.valor + Bens.calculaTarifacao());
    }
    
    public static Double calculaDesconto(){
        return  (valorDeclarado - Pagamento.calculaTaxa() - Deducao.calculaDeducao());
    }
    
    public static Double calculaImpostoPessoaFisica(){
        return  (valorDeclarado + ParaPessoaJuridica.calculaParcial() - ParaPessoaFisica.calculaDesconto());
    }
    
    @Override
    public String toString(){
        return  "\nNúmero:" + getNumero()+
                "\nAno:" + getAno()+
                "\nValor Declarado:" + getValorDeclarado()+
                "\nDedução:" + getDeducao()+
                "\nPagamento:" + getPagamento()+
                "\nBens:" + getBens()+
                "\nMulta:" + getMulta()+
                "\nDependente:" + getDependente();
    }
}
