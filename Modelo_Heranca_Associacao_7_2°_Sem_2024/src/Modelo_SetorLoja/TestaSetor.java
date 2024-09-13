
package Modelo_SetorLoja;

/**
 *
 * @author 363707
 */
public class TestaSetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DeLojas DL = new DeLojas(5, "", 
                new DeUtilidades (2, "", 7, 
                        new Cliente ("", "", 
                                new Endereco ("", "", ""), 
                                new Produto (23, "", 12.00,  
                                        new Fornecedor ("", "", 
                                                new Endereco ("", "", "")))), 
                        new Box (8, "", 
                                new Locatorio ("", "", 
                                        new Contrato (1, 13.00), 
                                        new Endereco ("", "", "")), 
                                new Produto (236, "", 14.99,  
                                        new Fornecedor ("", "", 
                                                new Endereco ("", "", ""))))), 
                new DeCalcados (6, "", "", 
                        new Cliente ("", "", 
                                new Endereco ("", "", ""), 
                                new Produto (10, "", 23.98,  
                                        new Fornecedor ("", "", 
                                                new Endereco ("", "", ""))))));
        System.out.println(DL);
        
        DeAlimentacao DA = new DeAlimentacao(1, "", "", 
                new Cliente ("", "", 
                        new Endereco ("", "", ""), 
                        new Produto (2, "", 23.65,  
                                new Fornecedor ("", "", 
                                        new Endereco ("", "", "")))));
        System.out.println(DA);
    }
    
}
