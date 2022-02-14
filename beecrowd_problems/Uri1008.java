import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        int idFuncionario, qtdHoras;
        double valorHora, salario;

        Scanner teclado = new Scanner(System.in);

        idFuncionario = teclado.nextInt();
        qtdHoras = teclado.nextInt();
        valorHora = teclado.nextDouble();

        salario = qtdHoras * valorHora;

        System.out.println("NUMBER = " + idFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        teclado.close();
    }
}