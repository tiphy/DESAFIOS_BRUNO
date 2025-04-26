import java.util.Scanner;

public class dez {
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

        for (int i = 0; i < nums.length; i++) {
            System.out.println("o dobro de " + nums[i] + " é: " + dobro[i]);
        }

    }

}