import java.util.Scanner;
    class um {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
      
        escreve(" === programa da media === ");

        escreve("informe a primeira nota: ");
        //double n1 = pedirNota(msg);
        double n1 = ler.nextDouble();

        escreve("informe a segunda nota: ");
       // double n2 = pedirNota(msg);
        double n2 = ler.nextDouble();

        escreve("informe a terceira nota: ");
       // double n3 = pedirNota(msg);
        double n3 = ler.nextDouble();

        double r = calculo(n1, n2, n3);

        escreve("a media do aluno é " + r);
        escreve("situação: " + situacao(r) );

    }

    public static void escreve(String msg){
        System.out.println(msg);
    }

    public static double pedirNota (String msg){
        Scanner ler = new Scanner(System.in);

        System.out.println(msg);
        double nota = ler.nextDouble();
        return nota;
    }

    public static double calculo (double n1, double n2, double n3){
        double media = (n1 + n2 + n3) / 3;
        return media;
    }

    public static String situacao (double media){
        String situacao;
         if(media >= 6){
            situacao = "aprovado";
        }
        else{
            situacao = "reprovado";
        }
        
        return situacao;
    }

}
