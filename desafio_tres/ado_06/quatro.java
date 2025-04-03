import java.util.Scanner;

public class quatro {
public static void main(String[] args) {
    Scanner ler = new  Scanner(System.in);

    System.out.println("informe o inicio: ");
    int inicio = ler.nextInt();

    System.out.println("informe o final: ");
    int fim = ler.nextInt();

    System.out.println();

    for(int cont = inicio; cont >= fim; cont--){
        System.out.println(cont);

    }

}
}