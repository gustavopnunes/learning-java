import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
       int count = 0;

       while (count < 6){
           if (valor % 2 != 0){
               System.out.println(valor);
               valor++;
               count++;
           } else {
               valor++;
           }
       }
        teclado.close();
    }
}