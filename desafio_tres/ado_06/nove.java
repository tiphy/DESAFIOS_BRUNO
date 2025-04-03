import java.util.Scanner;

public class nove {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("informe o primeiro numero: ");
        int num = ler.nextInt();

    
            for(int cont = 1; cont <=10 ; cont ++){
            int conta = num * cont; 

               System.out.println( num + " X " + cont + " = " + conta );
              
            }
           
    }
}