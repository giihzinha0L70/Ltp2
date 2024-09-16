package classeAbstrataPessoa;
public class TestaPessoa {
    public static void main(String[] args) {
        
        Professor P = new Professor("João", 1000, 5000, 
                new Filiacao("Pedro", "Joana"), "Mestre", "Educação");
        System.out.println(P);
        
        Empregado E = new Empregado("Giovanna", 1000, 7000, 
                new Filiacao("Vinícius", "Viviane"), "363707", "Diretora");
        System.out.println(E);
    }
    
}
