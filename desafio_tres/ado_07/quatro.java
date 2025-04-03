import java.util.Scanner;


public class quatro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe um número de inicio: ");
        int inicio = ler.nextInt();

        System.out.print("Informe um número de fim: ");
        int fim = ler.nextInt();

        int soma = 0;

        if (inicio % 2 != 0) {
            inicio++;
        }

        for (int i = inicio; i <= fim; i += 2) {
            soma += i;
        }

        System.out.println("A soma dos números pares de " + inicio + " a " + fim + " é: " + soma);

    }
}