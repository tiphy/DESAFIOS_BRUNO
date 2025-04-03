import java.time.LocalDate;
import java.util.*;

public class dois {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

    int diaAtual = LocalDate.now().getDayOfMonth();
       int mesAtual = LocalDate.now().getMonthValue();

        System.out.println("Quantidade de funcionários: ");
        int fun = ler.nextInt();

        for(int cont = 1; cont<= fun; cont++){
        System.out.println("Infrome o mês do seu aniversario: ");
        int mes = ler.nextInt();
        
        System.out.println("Infrome o dia do seu aniversario: ");
        int dia = ler.nextInt();
        


        if(mes == mesAtual && dia >= diaAtual){
            System.out.print(" Funcionário " + cont + ": Vai tirar folga no dia " + dia);
        }

        else if(mes == mesAtual && dia <= diaAtual){
         System.out.print(" Funcionário " + cont + ": Já tirou folga no dia." + dia);
        }

        else if(mes != mesAtual){
            System.out.print(" Funcionário " + cont + ": Esse mês vai trabalhar todos os dias.");
        }

    }

}
}