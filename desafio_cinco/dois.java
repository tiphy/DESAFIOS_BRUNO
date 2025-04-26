import java.util.Scanner;

public class dois {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] nome = new String[5];

        for (int i = 0; i < nome.length; i++) {
            System.out.print("Informe o nome " + (i + 1) + ": ");
            nome[i] = ler.nextLine();
        }

        System.out.println("Os nomes informados são:");
        for (String n : nome) {
            System.out.println(n);
        }

    }
}