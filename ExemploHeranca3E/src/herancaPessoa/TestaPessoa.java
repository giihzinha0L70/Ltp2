package herancaPessoa;

public class TestaPessoa {

    public static void main(String[] args) {
        Funcionario F = new Funcionario("Carolina", "999.999.999-99", "Vendedora", 1200.0);
        System.out.println(F);
        
        Professor P = new Professor("Rafael", "999.999.999-99", "Filosofia", 80000.0);
        System.out.println(P);
        
        Aluno A = new Aluno("Joao", "999.999.999-99", "99999-Y");
        System.out.println(A);
    }
    
}
