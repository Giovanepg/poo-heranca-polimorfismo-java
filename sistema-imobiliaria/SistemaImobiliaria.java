public class SistemaImobiliaria {
    public static void main(String[] args) {
        Novo imovelNovo = new Novo("Rua das Flores, 100", 300000, 25000);
        Velho imovelVelho = new Velho("Avenida Central, 250", 300000, 20000);

        System.out.println("=== IMÓVEL NOVO ===");
        imovelNovo.exibirDadosNovo();

        System.out.println();

        System.out.println("=== IMÓVEL VELHO ===");
        imovelVelho.exibirDadosVelho();
    }
}
