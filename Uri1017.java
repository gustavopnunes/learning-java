import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float tempo = teclado.nextFloat();
        float velocidadeMedia = teclado.nextFloat();
        float qtdLitrosNecessaria = (tempo * velocidadeMedia) / 12;
        System.out.printf("%.3f\n", qtdLitrosNecessaria);
        teclado.close();

    }
}