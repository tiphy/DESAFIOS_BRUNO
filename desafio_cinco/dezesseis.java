import java.util.*;

public class dezesseis {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("informe a quantidade de notas: ");
        int qnt = ler.nextInt();

        double[] notas = new double[qnt];

        System.out.println("informe as notas: ");
        for(int i = 0; i < qnt; i++){
            notas[i] = ler.nextDouble();
        }

        System.out.print("notas digitadas: ");
        for(double n : notas){
            System.out.print(n +  " - ");
        }
        System.out.println(" ");
       
        double soma = 0;
        for (double num : notas) {
             soma += num;
        }
        
        double media = soma / qnt;
        System.out.println("a media é: " + media);

        }
    }