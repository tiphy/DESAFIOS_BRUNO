import java.util.Scanner;

public class dois {
public static void main(String[] args) {
    Scanner ler = new  Scanner(System.in);

    System.out.println("Até qual numero? ");
    int num = ler.nextInt();

    for(int cont = num; cont >= 0; cont--){
        System.out.println(cont);

    }

}
}