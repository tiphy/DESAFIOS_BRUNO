import java.util.*;

public class um {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("informe o numero ");
        int num = ler.nextInt();

        int soma = 0;

        for (int cont = 1; cont <= num; cont++) {
            soma += cont;
        }

        System.out.println("a soma dos numeros de 1 a " + num + " é " + soma);

    }
}