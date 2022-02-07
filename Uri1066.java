import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        int valor, pares = 0, impares = 0, positivos = 0, negativos = 0;
        Scanner teclado = new Scanner(System.in);

        for(int count = 0; count < 5; count++){
            valor = teclado.nextInt();
            if(valor % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (valor < 0 && valor != 0 ){
                negativos++;
            } else if (valor > 0) {
                positivos++;
            }
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
        teclado.close();

    }
}