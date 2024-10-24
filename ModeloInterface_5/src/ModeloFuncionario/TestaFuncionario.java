
package ModeloFuncionario;

/**
 *
 * @author 363707
 */
public class TestaFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vendedor V = new Vendedor("363707", "Giovanna", 2550.00, 
                new Endereco("Rua 8", 8), 25, 
                new Cliente("040.558.862-05", "Juliana", 22, 
                        new Endereco("Mansões Por do Sol", 7), 
                        new DoCliente(2, "tem de ser na hora", 850.0), 
                        new Medicamento("A25SD", "Luxturna", 1250.5, 
                                new Fornecedor("Urgente", "DrogaSam", 
                                        new Endereco("Rua Vicente P.", 16), 
                                        new DoFornecedor(5, "...", "23.10.24", 2000.0)))), 
                new Medicamento("HG556HY", "Luxturna", 2500.0, 
                        new Fornecedor("...", "FarmaLife", 
                                new Endereco("Rua da Conceição", 4), 
                                new DoFornecedor(5, "...", "23.10.24", 2000.0))));
        System.out.println(V);
        
        Entregador E = new Entregador("252147", "Júlio", 3000.0, 
                new Endereco("Mansoões Olindas", 2), "Haojue Chopper Road 150 2023", 
                new Medicamento("A25SD", "Luxturna", 1250.5,
                        new Fornecedor("...", "DrogaSam", 
                                new Endereco("Master Fly", 6), 
                                new DoFornecedor(7, "...", "21.10.24", 2000.0))));
        System.out.println(E);
    }
    
}
