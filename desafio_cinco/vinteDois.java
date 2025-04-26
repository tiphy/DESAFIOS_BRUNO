import java.util.*;
public class vinteDois {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("informe a posiçao: ");
        int pos = ler.nextInt();

        String[] dias = {"domingo", "segunda", "terça", "quarta", "quinta", "sexta", "sabado"};
        
        String dia = dias[pos];
        System.out.println(dia);
    }
    
}