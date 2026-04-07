public class SistemaIngressos {
    public static void main(String[] args) {

        Ingresso ingresso = new Ingresso(50);
        ingresso.imprimeValor();

        Vip vip = new Vip(50, 30);
        System.out.println("VIP: R$ " + vip.getValorVIP());

        Normal normal = new Normal(50);
        normal.imprimeTipo();

        CamaroteInferior ci = new CamaroteInferior(50, 20, "Setor A");
        ci.imprimeLocalizacao();
        System.out.println("Valor: R$ " + ci.getValorVIP());

        CamaroteSuperior cs = new CamaroteSuperior(50, 40);
        System.out.println("Camarote Superior: R$ " + cs.getValorTotal());
    }
}
