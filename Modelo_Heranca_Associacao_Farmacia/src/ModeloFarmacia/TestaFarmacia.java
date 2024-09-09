
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
        Compra C = new Compra(36, "09.09.24", 27.34, 
                new Pagamento ("Cartão Débito"), 
                new Cliente ("12.123.668/6542-07", "Joana Cristina da Silva", "12.06.90", 
                        new Receita ("09.09.24", 27.34, 
                                new Farmaceutico (122333, "João Pedro S. Souza", 3.407.00, "Farmacêutico")), 
                        new Pedido (3, 82.02, 
                                new Perfumaria ("3642-6958-254", "Coffee Woman Seduction Desodorante Colônia 100ml", 494.49, 
                                        new Fornecedor ("13.636.598/5004-85", "O boticário", "St. Oeste Lote 2 - Zona Industrial, Brasília - DF, 71250-115"), 20, "Empresa de capital fechado", 
                                new Atendente (36241, "Maria Flor Vasconcelos", 1.810.00, 22)));
        System.out.println(C);
    }
    
}
