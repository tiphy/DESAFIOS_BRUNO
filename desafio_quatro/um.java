import java.util.Scanner;

    public class um{
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            System.out.println("Qual a quantidade de itens: ");
            int itens = ler.nextInt();

            System.out.println(" -- PROGRAMA DESCONTO VARIADO -- ");
            System.out.println("Quantidade de itens: " + itens);
            System.out.println("Valor unitário: 20");
            System.out.println();

            int unidade = 20;
            

            if (itens <= 5){
                int valor = itens * unidade;
                System.out.println("Total sem desconto: " + valor );
                System.out.println("Descnto aplicado: R$ 0,00" );
                System.out.println("Valor final: " + valor);
            }
            else if(itens >= 6 && itens <= 9){
                int valor = itens * unidade;
                int des = valor - 50;
                System.out.println("Total sem desconto: " + valor );
                System.out.println("Descnto aplicado: R$ 50,00" );
                System.out.println("Valor final: " + des);
            }
            else if(itens >= 10){
                int valor = itens * unidade;
                int des = valor - 100;
                System.out.println("Total sem desconto: " + valor );
                System.out.println("Descnto aplicado: R$ 100,00" );
                System.out.println("Valor final: " + des);

            }
        }
    }