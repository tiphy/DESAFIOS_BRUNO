import java.util.Scanner;
public class vinteCinco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("informe o nome do projeto: ");
        String nome = ler.next();

        System.out.println("informe a quantidade de doaçoes recebidas: ");
        int qnt = ler.nextInt();

        System.out.println("informe a meta: ");
        double meta = ler.nextDouble();

        double[] valores = new double[qnt];
        System.out.println("informe o valor das doaçoes: ");
        for(int i = 0; i< qnt; i++){
            valores[i] = ler.nextDouble();
        }

        double soma = 0;
        for(double rsl : valores ){
            soma += rsl;
        }

        double maiorValor = valores[0];
        for(int i = 1; i < valores.length; i++){
            if (valores[i] >= maiorValor){
                maiorValor = valores[i];
            }
        } 
            System.out.println("o projeto " + nome + " recebeu " + qnt + " doaçoes, totaizando " + soma + " reais ");
            System.out.println("----------------------------");
            System.out.println("as doaçoes recebidas foram: ");
            for(double v : valores){
                System.out.print(v + " - ");
            }
            System.out.println(" ");
            System.out.println("----------------------------");
            System.out.println("a maior doaçao rececbida foi " + maiorValor + " reais ");
          
            if (soma >= meta){
                System.out.println("a meta foi atingida! ");
            }
            else{
                System.out.println("a meta nao foi atingida ");
            }
    }
}