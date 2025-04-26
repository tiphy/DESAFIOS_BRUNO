import java.util.*;
public class seis {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("informe a frase: ");
        String frase = ler.next();

        char[] caractereArray = frase.toCharArray();

        for(char item : caractereArray){
            System.out.println(item);
        }
    }
}