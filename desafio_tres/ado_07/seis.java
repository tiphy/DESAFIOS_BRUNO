
import java.util.Scanner;

public class seis {
    public static void main(String[]args){
    Scanner ler = new Scanner(System.in);
    
        System.out.println("Informe um número: ");
        int num = ler.nextInt();

        System.out.println("informe a potencia: ");
        int pot = ler.nextInt();

        int soma = 0;

        if(pot == 0){
            System.out.println(num + " elevado a 0 é 1");
        }
      
        for (int i = num; i <= pot; i++) {
            if (i % pot == 0) {
                soma += i;
            }
            else{

            }
        }

        System.out.println( num + " elevado a " + pot + " é: " + soma);
    }
}