package unicap.sistemasdegerenciamento.Restaurante;

public class Pedido {
    private int id;
    private Mesa mesa;
    private List<ItemDoPedido> itens;
    private double total;

    public Pedido(int id, Mesa mesa) {
        this.id = id;
        this.mesa = mesa;
        this.itens = new ArrayList<>();
        this.total = 0.0;
    }

    public void adicionarItem(ItemDoPedido item) {
        itens.add(item);
        total += item.getPreco();
    }

    public void removerItem(ItemDoPedido item) {
        itens.remove(item);
        total -= item.getPreco();
    }

// Ainda tá faltando coisa
