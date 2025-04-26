import java.util.*;
public class quatorze {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("informe a quantidade de nomes: ");
        int qnt = ler.nextInt();

        String[] frases = new String[qnt];
        System.out.println("informe os nomes: ");
        for(int pos = 0; pos < qnt; pos++){
            frases[pos] = ler.next();
        }

        System.out.println("os nomes que iniciam com L sao:");
        for(String nome : frases) {
            if (nome.charAt(0) == 'L') {
                System.out.println(nome);
            }
        }
    }
    
}