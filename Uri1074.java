import java.util.Scanner;

public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int quantidade = teclado.nextInt();
        int n;
        String resultado;;
        for (int count = 0; count < quantidade; count++){
            resultado = "";
            n = teclado.nextInt();
            if (n % 2 == 0 && n != 0){
                resultado = "EVEN";
            } else if (n % 2 != 0 && n != 0){
                resultado = "ODD";
            } 
            if (n > 0){
                resultado += " POSITIVE";
            } else if (n < 0){
                resultado += " NEGATIVE";
            }

            if (n == 0){
                resultado = "NULL";
            }

            System.out.println(resultado);
        }
        teclado.close();
    }
}