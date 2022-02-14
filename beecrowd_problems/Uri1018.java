import java.util.Scanner;

public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();

        int notasCem, notasCinquenta, notasVinte, notasDez, notasCinco, notasDois, notasUm, sobra;

        notasCem = valor / 100;
        sobra = valor % 100;
        notasCinquenta = sobra / 50;
        sobra = sobra % 50;
        notasVinte = sobra / 20;
        sobra = sobra % 20;
        notasDez = sobra / 10;
        sobra = sobra % 10;
        notasCinco = sobra / 5;
        sobra = sobra % 5;
        notasDois = sobra / 2;
        sobra = sobra % 2;
        notasUm = sobra / 1;
        
        System.out.println(valor);
        System.out.println(notasCem + " nota(s) de R$ 100,00");
        System.out.println(notasCinquenta + " nota(s) de R$ 50,00");
        System.out.println(notasVinte + " nota(s) de R$ 20,00");
        System.out.println(notasDez + " nota(s) de R$ 10,00");
        System.out.println(notasCinco + " nota(s) de R$ 5,00");
        System.out.println(notasDois + " nota(s) de R$ 2,00");
        System.out.println(notasUm + " nota(s) de R$ 1,00");

        teclado.close();

    }
}