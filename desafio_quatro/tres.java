import java.util.Scanner;

public class tres {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("informe o saldo inicial: ");
        double saldo = ler.nextDouble();

        System.out.println("Quantos saques deseja fazer: ");
        int Quantidade = ler.nextInt();

        for (int cont = 1; cont <= Quantidade; cont++) {

            System.out.println("Infrme o valor do saque: ");
            double saque = ler.nextDouble();

            System.out.println("Valor do saque: " + saque);

            if (saque <= saldo) {
                saldo -= saque;
                System.out.println("Saque de R$ " + saque + " autorizado!");
            }
            
            else {
                System.out.println("Saldo de R$ " + saque + " negado.");
            }

            System.out.println("Saldo atualizado: R$ " + saque);
        }
    }
}