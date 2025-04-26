import java.util.*;

public class treze {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("informe a quantidade de numeros: ");
        int qnt = ler.nextInt();

        int[] nums = new int[qnt];

        System.out.println("informe os numeros: ");
        for(int i = 0; i < qnt; i++){
            nums[i] = ler.nextInt();
        }

        System.out.println("voce digitou os numeros: ");
        for (int n : nums) {
            System.out.println(n);
        }
        
        System.out.println("os numeros pares sao: ");
        for(int i = 0; i < qnt; i++){
            if (nums[i] % 2 == 0) {
                System.out.println(nums[i]);
            }
        }

    }
}