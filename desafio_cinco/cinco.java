import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("informe a tabuada");
        int num = ler.nextInt();

        System.out.println("a tabuada do " + num + " é: ");

        double[] arrray = new double[10];

        for (int i = 0; i <= 10; i++) {
            int tab = num * i;

            for (int j = 0; j < 1; j++) {
                arrray[j] = tab;

                System.out.println(arrray[j]);
            }

        }

    }

}