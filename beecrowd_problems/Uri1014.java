import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double distanciaPercorrida, combustivelGasto;

        distanciaPercorrida = teclado.nextDouble();
        combustivelGasto = teclado.nextDouble();

        double mediaGasto = distanciaPercorrida / combustivelGasto;

        System.out.printf("%.3f km/l\n", mediaGasto);
        teclado.close();
    }
}