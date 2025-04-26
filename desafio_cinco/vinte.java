import java.util.*;
public class vinte {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("informe a quantidade de notas: ");
        int qnt = ler.nextInt();

        double[] notas = new double[qnt];

        System.out.println("informe a média dos alunos: ");
        for(int i = 0; i < qnt; i++){
            notas[i] = ler.nextDouble();
        }

        boolean todosPassaram = true;
        for (int j = 0; j < notas.length; j++) {
            if (notas[j] < 6.0) {
                todosPassaram = false;
            }
        }

        if (todosPassaram) {
            System.out.println("todos os alunos passaram ");
        } 
        
        else {
            System.out.println("nem todos os alunos passaram ");
        }

    }
    
}