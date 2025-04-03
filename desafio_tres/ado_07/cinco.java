import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.print("Informe um numero: ");
        int multiplo = scanner.nextInt();
       
        System.out.print("Informe o número de início: ");
        int inicio = scanner.nextInt();
     
        System.out.print("Informe o número de fim: ");
        int fim = scanner.nextInt();
    
        int soma = 0;
      
        for (int i = inicio; i <= fim; i++) {
            if (i % multiplo == 0) {
                soma += i;
            }
        }
    
        System.out.println("A soma dos números múltiplos de " + multiplo + ", de " + inicio + " a " + fim + " é: " + soma);

    }
}