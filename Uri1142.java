import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int count = 1;
        for (int i = 0; i < numero; i++){
            System.out.printf("%d %d %d PUM\n", count , count + 1, count + 2);
            count += 4;
        }
        teclado.close();
    }
}