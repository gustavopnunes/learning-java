import java.util.Scanner;

public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int senha = 2002;
        int entrada = teclado.nextInt();
        while (entrada != senha){
            System.out.println("Senha Invalida");
            entrada = teclado.nextInt();
        } 
        System.out.println("Acesso Permitido");
        teclado.close();
    }
}