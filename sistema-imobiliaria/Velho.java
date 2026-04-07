public class Velho extends Imovel {
    private double desconto;

    public Velho(String endereco, double valor, double desconto) {
        super(endereco, valor);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getValorFinal() {
        return getValor() - desconto;
    }

    public void exibirDadosVelho() {
        exibirDados();
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + getValorFinal());
    }
}