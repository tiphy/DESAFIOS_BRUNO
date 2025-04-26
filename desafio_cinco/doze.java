import java.util.Scanner;

public class doze {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("informe a quantidade de pilotos competindo: ");
        int numPilotos = ler.nextInt();

        int[] largada = new int[numPilotos];
        int[] chegada = new int[numPilotos];

        System.out.println("informe as posições dos pilotos na largada: ");
        for (int i = 0; i < numPilotos; i++) {
            System.out.print("Piloto " + (i + 1) + ": ");
            largada[i] = ler.nextInt();
        }

        System.out.println("informe as posições dos pilotos na chegada: ");
        for (int i = 0; i < numPilotos; i++) {
            System.out.print("piloto " + (i + 1) + ": ");
            chegada[i] = ler.nextInt();
        }

        System.out.println(" ");
        for (int i = 0; i < numPilotos; i++) {
            int inicio = largada[i];
            int fim = chegada[i];
            int dfr = inicio - fim;

            if (dfr > 0) {
                System.out.println("piloto " + (i + 1) + " avançou " + dfr + " posições.");
            } 
            else if (dfr < 0) {
                System.out.println("piloto " + (i + 1) + " retrocedeu " + (- dfr) + " posições.");
            } 
            else {
                System.out.println("piloto " + (i + 1) + " manteve a posição.");
            }
        }
    }
}