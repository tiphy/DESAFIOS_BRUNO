import java.util.Scanner;

public class quatro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("inofrme a quantidade de numeros: ");
        int qnt = ler.nextInt();

        double[] nums = new double[qnt];
        
        System.out.println("informe os numerso: ");
        for (int pos = 0; pos < qnt; pos++) {
            nums[pos] = ler.nextInt();
        }
    
        System.out.println("os numeros digitados foram: ");
    
        for (int i = qnt - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }

    }
}