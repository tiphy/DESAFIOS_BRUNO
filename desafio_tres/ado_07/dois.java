import java.util.Scanner;

public class dois {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int num = ler.nextInt();

        int fatorial = 1;

        for (int cont = 1; cont <= num; cont++) {
            fatorial *= cont; 
        }

        System.out.println("O fatorial de " + num + " é " + fatorial);
    }
}