
package ModeloFarmacia;

/**
 *
 * @author 363707
 */
public class TestaFarmacia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Compra C = new Compra(23, "", 20.00, 
                   new Pagamento (""), 
                   new Cliente ("", "", "", 
                           new Receita ("", 23.00, 
                                   new Farmaceutico (2, "", 236.00, ""), 
                                   new Medicamento ("", "", 32.00, 
                                           new Fornecedor ("", "", ""), "","")), 
                           new Pedido (3, 56.00, 
                                   new Perfumaria ("", "", 32.00, 
                                           new Fornecedor ("", "", ""), 20.00, ""), 
                                   new Atendente (5, "", 36.00, 26))));
        
        
    }
    
}
