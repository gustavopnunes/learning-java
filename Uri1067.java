import java.util.Scanner;
public class Uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();

        for (int c = 1; c <= valor; c += 2){
            System.out.println(c);
        }
        teclado.close();
    }
}