import java.util.Scanner;

public class onze {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("informe a quantidade de numeros: ");
        int array = ler.nextInt();

        int[] array1 = new int[array];
        int[] array2 = new int[array];
        int[] soma = new int[array];

        System.out.println("primeiro array: ");
        for (int i = 0; i < array; i++) {
            array1[i] = ler.nextInt();
        }

        System.out.println("segundo array: ");
        for (int i = 0; i < array; i++) {
            array2[i] = ler.nextInt();
        }

        for (int i = 0; i < array; i++) {
            soma[i] = array1[i] + array2[i];
        }

        System.out.println("soma dos arrays: ");
        for (int i = 0; i < array; i++) {
            System.out.println(soma[i]);
        }

    }
    
}