import java.util.Scanner;

public class vinteQuatro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o nome do projeto: ");
        String nome = ler.nextLine();

        System.out.println("informe a quantidade de doaçoes: ");
        int qnt = ler.nextInt();

        double[] valores = new double[qnt];

        int i = 0;
        boolean menosUm = true;

        System.out.println("informe o valor das doaçoes: ");
        while (menosUm) {
            double valor = ler.nextDouble();

            if (valor == -1) {
                break;
            }

            else if (i < valores.length) {
                valores[i] = valor;
                i++;
            }

            else {
                break;
            }

        }

        double soma = 0;
        for (double rsl : valores) {
            soma += rsl;
        }

        System.out.println("o projeto " + nome + " recebeu " + qnt + " doaçoes, totaizando " + soma + " reais ");
        System.out.println("----------------------------");
        System.out.println("as doaçoes recebidas foram: ");
        for (double v : valores) {
            System.out.print(v + " - ");
        }

    }
}