import java.util.Scanner;

public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();

        for (int count = 2; count <= valor; count += 2 ){
            int quadrado = count * count;
            System.out.println(count + "^2 = " + quadrado);
        }
        teclado.close();
    }
}