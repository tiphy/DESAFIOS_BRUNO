
import java.util.Scanner;

public class ex_01 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Até quanto quer contar?");
        int numero = ler.nextInt();

// Somatório
        for (int i = 0; i <= numero; i++) {
            System.out.println(i);

        }
    }
}
