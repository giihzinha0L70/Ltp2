
package ModeloProduto;

/**
 *
 * @author 363707
 */
public class TestaLoja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Loja L = new Loja("XXX/0001-XX", "Casas Bahia", 
                new Geladeira("7 898357 41789", "...", 2500.5, 
                        new Fornecedor("XXX/0001-XX", "Casas Bahia", 
                                new DoFornecedor(24, "30.09.24", 500.5, "30.10.24"), 
                                new Endereco("Mansões Por do Sol", 5)), 
                        new Fisica("Júlia", 1.8, 250.6, 1999, 2024, 
                                new Endereco("Mansões Por do Sol", 5), "123.456.789-00", 
                                new DoCliente(19, "30.09.24", 250.5, "Aqui Sempre Tem")), "Gelopar", 3), 
                new Fogao("7 898357 417892", "...", 200.6, 
                        new Fornecedor("XXX/0001-XX", "Casas Bahia", 
                                new DoFornecedor(24, "30.09.24", 500.5, "30.10.24"), 
                                new Endereco("Mansões Por do Sol", 5)), 
                        new Fisica("Júlia", 1.8, 250.6, 1999, 2024, 
                                new Endereco("Mansões Por do Sol", 5), "123.456.789-00", 
                                new DoCliente(19, "30.09.24", 250.5, "Aqui Sempre Tem")), 6), 
                new MaquinaLavar("7 898357 41789", "...", 3600.2, 
                        new Fornecedor("XXX/0001-XX", "Casa Bahia", 
                                new DoFornecedor(24, "30.09.24", 500.5, "30.10.24"), 
                                new Endereco("Mansões Por do Sol", 5)), 
                        new Fisica("Júlia", 1.8, 250.6, 1999, 2024, 
                                new Endereco("Mansões Por do Sol", 5), "123.456.789-00", 
                                new DoCliente(19, "30.09.24", 250.5, "Aqui Sempre Tem"))));
        System.out.println(L);
    }
    
}
