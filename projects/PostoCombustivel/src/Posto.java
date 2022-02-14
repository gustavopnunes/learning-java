import java.util.Scanner;

public class Posto {
    public static void main(String[] args) {
        Bomba bomba1 = new Bomba("Gasolina", 5.89);
        Bomba bomba2 = new Bomba("Etanol", 4.39);
        Bomba bomba3 = new Bomba("Diesel", 6.13);

        Scanner teclado = new Scanner(System.in);


        System.out.println("Qual combustivel? ");
        System.out.println("1: Gasolina");
        System.out.println("2: Etanol");
        System.out.println("3: Diesel");
        int tipo = teclado.nextInt();
        System.out.println("Litros ou reais?");
        System.out.println("1 - Litros");
        System.out.println("2 - Reais");
        int medida = teclado.nextInt();
        System.out.println("Quanto?");
        int quantidade = teclado.nextInt();

        switch(tipo){
            case 1:
                System.out.println(bomba1.abastecer(medida, quantidade));
                break;
            case 2:
                System.out.println(bomba2.abastecer(medida, quantidade));
                break;
            case 3:
                System.out.println(bomba3.abastecer(medida, quantidade));
                break;
        }
    }
}
