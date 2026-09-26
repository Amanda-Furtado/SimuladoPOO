package q4;

public class Main {
    public static void main(String[] args) {
        GestaoPedidos restaurante = new GestaoPedidos();

        System.out.println("--- BEM-VINDO AO RESTAURANTE MAIS LEGAL DO MUNDO! ---");

        restaurante.adicionarPedido("Doce de Teias de Aranha (Shrek 1)");
        restaurante.adicionarPedido("Batata Frita com MUITO ketchup (Undertale)");
        restaurante.adicionarPedido("Garrafa misteriosa com o rótulo 'Beba-me' (Alice)");

        System.out.println("--- PEDIDOS INICIAIS ---");
        restaurante.listarPedidos();

        String removido = restaurante.proximoPedido();
        System.out.println("\nSaindo um " + removido + "!");

        System.out.println("Pedidos restantes no sistema: " + restaurante.quantidadePendentes());

        restaurante.listarPedidos();
    }
}