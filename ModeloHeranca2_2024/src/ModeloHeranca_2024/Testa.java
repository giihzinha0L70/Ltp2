
package ModeloHeranca_2024;

/**
 *
 * @author 363707
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DeSal DS = new DeSal("10.10.24", "02.08.26", 6378517, "20min", 3, 30);
        System.out.println(DS);
        
        Recheado R = new Recheado("20.08.25", "25.08.25", 6958234, "15min", "pão doce", "creme de leite");
        System.out.println(R);
        
        Bolo B = new Bolo("04.02.24", "08.02.24", 6666667, "bolo de festa", 15, 257);
        System.out.println(B);
        
        Assado A = new Assado("16.03.24", "17.03.24",  1236547, "de presunto e queijo", 5, 20);
        System.out.println(A);
        
        Frito F = new Frito("16.03.24", "17.03.24",  1236548, "enroladinho de salsicha", 33, "farinha de arroz");
        System.out.println(F);
    }
    
}
                        