import java.util.Scanner;

public class Uri1009{
    public static void main(String ars[]){
        String nome;
        double salario, totalVendas, totalAReceber;
        Scanner teclado = new Scanner(System.in);

        nome = teclado.nextLine();
        salario = teclado.nextDouble();
        totalVendas = teclado.nextDouble();
        totalAReceber = salario + totalVendas * 0.15;
        System.out.printf("TOTAL = R$ %.2f\n", totalAReceber);
        teclado.close();
    }
}