public class CamaroteSuperior extends Vip {

    public CamaroteSuperior(double valor, double valorAdicional) {
        super(valor, valorAdicional);
    }

    public double getValorTotal() {
        return getValor() + getValorAdicional();
    }
}

