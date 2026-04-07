public class Imovel {
    private String endereco;
    private double valor;

    public Imovel(String endereco, double valor) {
        this.endereco = endereco;
        this.valor = valor;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }

    public void exibirDados() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Valor base: R$ " + valor);
    }
}
