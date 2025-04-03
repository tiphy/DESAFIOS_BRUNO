
import java.util.Scanner;

public class doze {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Até qual numero? ");
        int num = ler.nextInt();

        for (int cont2 = 0; cont2 <= num; cont2++) {
            for (int cont = 0; cont <= cont2; cont++) {
                System.out.print(" * ");

            }
            System.out.println();
        }

    }
}