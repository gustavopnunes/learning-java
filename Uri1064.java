import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        int count = 0;
        float soma = 0;
        float valor;
        Scanner teclado = new Scanner(System.in);
        for (int numero = 1; numero <= 6; numero++){
            valor = teclado.nextFloat();
            if (valor > 0) {
                count++;
                soma += valor;
            }
        }
        float media = soma / count;
        System.out.println(count + " valores positivos");
        System.out.printf("%.1f\n", media);
    }
}