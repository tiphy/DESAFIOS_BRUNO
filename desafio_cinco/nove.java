import java.util.Scanner;

public class nove {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("informe a quantidade de numeros: ");
        int qnt = ler.nextInt();

        double[] nums = new double[qnt];

        for (int i = 0; i < qnt; i++) {
            System.out.println("numero " + (i + 1) + ":");
            nums[i] = ler.nextDouble();
        }

        double[] dobro = new double[qnt];

        for (int i = 0; i < qnt; i++) {
            dobro[i] = nums[i] * 2;
        }

        System.out.println("numeros de entrada: ");
        for (double num : nums) {
            System.out.println(num + " ");
        }

        System.out.println("dobro dos numeros: ");
        for (double num : dobro) {
            System.out.println(num + " ");
        }

    }
}