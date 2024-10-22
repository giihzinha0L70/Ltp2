
package interfaceTecnico;

/**
 *
 * @author 363707
 */
public class TestaTecnico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario Fun = new Funcionario("252.336.225.44", "Maria", 
                new Endereco("Vila Rosa", 13), 7, 570.00);
        System.out.println(Fun);
        
        Tecnico Tec = new Tecnico("585.447.696-66", "Rafael", 
                new Endereco("Vila Boa", 45), "696-147", 500.00, 
                new Equipamento("Apple", "semanal"));
        System.out.println(Tec);
        
        Cliente Cli = new Cliente("254.556.998-47", "Fabiano", 
                new Endereco("Rua das Graças", 2), 12.00, 7800, 
                new Internet("MEU_PC", 650.0), 
                new Impressao("MEU_PC", 650.00));
        System.out.println(Cli);
    }
    
}
