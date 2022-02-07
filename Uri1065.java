import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        int valor;
        int quantidade = 0;
        Scanner teclado = new Scanner(System.in);
        for (int count = 0; count < 5; count++) {
            valor = teclado.nextInt();
            if (valor % 2 == 0){
                quantidade++;
            }
        }
        System.out.println(quantidade + " valores pares");
    }
}