import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
        int horas = valor / 3600;
        int segundosRestantes = valor % 3600;
        int minutos = segundosRestantes / 60;
        int segundos = segundosRestantes % 60;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
        teclado.close();
    }
}