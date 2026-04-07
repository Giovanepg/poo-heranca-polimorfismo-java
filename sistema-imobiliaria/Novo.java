public class Novo extends Imovel {
    private double adicional;

    public Novo(String endereco, double valor, double adicional) {
        super(endereco, valor);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public double getValorFinal() {
        return getValor() + adicional;
    }

    public void exibirDadosNovo() {
        exibirDados();
        System.out.println("Adicional: R$ " + adicional);
        System.out.println("Valor final: R$ " + getValorFinal());
    }
}