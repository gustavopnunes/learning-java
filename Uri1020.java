import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int qtdDias = teclado.nextInt();

        int anos = qtdDias / 365;
        int meses = (qtdDias % 365) / 30;
        int dias =   qtdDias - (meses * 30) - (anos * 365);

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
        teclado.close();
    }
}