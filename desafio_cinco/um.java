import java.util.Scanner;

public class um {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double[] nums = new double[5];

        for (int pos = 0; pos < 5; pos++) {
            System.out.print("Informe o numero " + (pos + 1) + ": ");
            nums[pos] = ler.nextDouble();
        }

        System.out.println("Os numeros informados são: ");
        for (Double n : nums) {
            System.out.println(n);
        }

    }
}