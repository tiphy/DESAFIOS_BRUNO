import java.util.Scanner;

public class treze {
      public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Até qual numero? ");
        int num = ler.nextInt();

        for (int cont = 1; cont <= num; cont++) {
            for (int cont2 = 1; cont2 <= cont; cont2++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    

    }
}