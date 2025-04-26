import java.util.*;

public class sete {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("informe a quantidade de ingressos: ");
    int qnt = ler.nextInt();

    System.out.print("Informe o código do cupom do ingresso: ");
    String cupom = ler.next();

    String[] ingressos = new String[qnt];

    for (int i = 0; i < qnt; i++) {
      ingressos[i] = cupom + (i + 1);
    }

    System.out.println("os ingressos gerados foram: ");
    for (int i = 0; i < qnt; i++) {

      System.out.println(ingressos[i]);
    }
  }

}