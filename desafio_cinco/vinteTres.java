
import java.util.*;
public class vinteTres {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("informe a posiçao: ");
        int pos = ler.nextInt();

        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

        String mes = meses[pos];
        System.out.println(mes);

    }
    
}