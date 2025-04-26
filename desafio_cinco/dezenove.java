import java.util.Scanner;

public class dezenove {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("informe a quantidade de notas: ");
        int qnt = ler.nextInt();

        double[] notas = new double[qnt];
        
        System.out.println("informe as notas: ");
        for (int i = 0; i < qnt; i++) {
            notas[i] = ler.nextDouble();
        }

        double soma = 0;
        for (double num : notas) {
            soma += num;
        }
        double media = soma / qnt;

        double maiorNota = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }

            double menorNota = notas[0];
            for (int j = 1; j < notas.length; j++) {
                if (notas[j] < menorNota) {
                    menorNota = notas[j];
                }
            }
    
            System.out.print("notas digitadas: ");
            for (double n : notas) {
                System.out.print(n + " - ");
            }

            System.out.println(" ");
    
            System.out.println("a media é: " + media);
            System.out.println("a maior nota é: " + maiorNota);
            System.out.println("a menor nota é: " + menorNota);
    
    }
}
