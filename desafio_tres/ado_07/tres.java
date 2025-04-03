import java.util.Scanner;


public class tres {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe um número de inicio : ");
        int numero = ler.nextInt();

        int soma = 0;

        for (int i = 2; i <= numero; i += 2) {
            soma += i;
        }

        System.out.println("A soma dos números naturais pares de 1 até " + numero + " é: " + soma);

    }
}