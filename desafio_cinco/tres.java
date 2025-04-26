import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("inofrme a quantidade de numeros: ");
        int qnt = ler.nextInt();

        double[] nums = new double[qnt];

        for (int pos = 0; pos < qnt; pos++) {
            System.out.print("Informe o numero " + (pos + 1) + ": ");
            nums[pos] = ler.nextDouble();
        }

        System.out.println("Os numeros informados são: ");
        for (Double n : nums) {
            System.out.println(n);
        }

    }
}
