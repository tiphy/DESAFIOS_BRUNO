import java.util.Scanner;

public class doze {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = ler.nextInt();

        if (num <= 1) {
            System.out.println("O número " + num + " não é primo.");
        } 
        
        else {
            boolean primo = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    primo = false;
                }
            }

            if (primo) {
                System.out.println("O número " + num + " é primo.");
            } 
            
            else {
                System.out.println("O número " + num + " não é primo.");
            }
        }
    }
}