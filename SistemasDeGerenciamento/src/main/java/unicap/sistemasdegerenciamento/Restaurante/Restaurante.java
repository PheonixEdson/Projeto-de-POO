package unicap.sistemasdegerenciamento.Restaurante;

public class Restaurante {

    public static void main(String[] args) {
        Mesa mesa1 = new Mesa(1);
        mesa1.ocuparMesa();
        
        ItemDoPedido item1 = new ItemDoPedido("Pizza", 2, 20.00);
        ItemDoPedido item2 = new ItemDoPedido("Batata Frita", 1, 8.00);
        ItemDoPedido item3 = new ItemDoPedido("Refrigerante", 2, 5.00);
        
        Pedido pedido = mesa1.getPedido();
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);
        pedido.adicionarItem(item3);
        
        System.out.println("\nRelatorio de Pedido da Mesa " +mesa1.getNumero()+ ": ");
        pedido.gerarRelatorio();
        
        pedido.fecharPedido();
        
        System.out.println("Conta Final: ");
        pedido.gerarRelatorio();
        
        mesa1.liberarMesa();
        System.out.println("\nA mesa foi liberada. Esta ocupada? " + mesa1.isOcupada());
        
    }
}
