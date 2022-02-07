import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]) {

    int idPecaI, idPecaII, qtdPecaI, qtdPecaII;
    float precoPecaI, precoPecaII, total;
    Scanner teclado = new Scanner(System.in);

    idPecaI = teclado.nextInt();
    qtdPecaI = teclado.nextInt();
    precoPecaI = teclado.nextFloat();
    idPecaII = teclado.nextInt();
    qtdPecaII = teclado.nextInt();
    precoPecaII = teclado.nextFloat();

    total = (qtdPecaI * precoPecaI) + (qtdPecaII * precoPecaII);

    System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    teclado.close();
    }
}