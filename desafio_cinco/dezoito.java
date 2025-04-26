import java.util.*;
public class dezoito {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("informe a quantidade de notas: ");
        int qnt = ler.nextInt();
        
        double[] notas = new double[qnt];

        System.out.println("digite as notas: ");
        for (int i = 0; i < qnt; i++) {
            notas[i] = ler.nextDouble();
        }

        double menorNota = notas[0];
        for(int i = 1; i > notas.length; i++){
            if (notas[i] < menorNota){
                menorNota = notas[i];
            }
        }
        System.out.print("notas digitadas: ");
        for (int j = 0; j < notas.length; j++) {
            System.out.print(notas[j] + " - ");
        }

        System.out.println();
        System.out.println("a maior nota é: " + menorNota);

    }
    
}