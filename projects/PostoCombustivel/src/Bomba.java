import java.util.Scanner;

public class Bomba {
    private String nome;
    private double valor;
    private double qtdLitros;
    private double valorTotal;

    Scanner teclado = new Scanner(System.in);

    public Bomba(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getQtdLitros() {
        return qtdLitros;
    }


    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String abastecer(int medida, double quantidade){
        if (medida == 1) {
            valorTotal = quantidade * valor;
        }

        if (medida == 2){
            valorTotal = valor;
            quantidade = valor / this.valor;
        }

        return String.format("Você abasteceu: %.2f litros\nTotal a pagar: R$ %.2f", quantidade, valorTotal);
    }
}