package unicap.sistemasdegerenciamento.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private Mesa mesa;
    private List<ItemDoPedido> itens;
    private double total;
    private boolean fechado;

    public Pedido(int id, Mesa mesa) {
        this.id = id;
        this.mesa = mesa;
        this.itens = new ArrayList<>();
        this.total = 0.0;
        this.fechado = false;
    }

    public void adicionarItem(ItemDoPedido item){
        if(fechado == false){
            itens.add(item);
            total += item.calcularPrecoTotal();
        }
        else{
            System.out.println("O pedido ja foi fechado!");
        }
    }

    public void removerItem(ItemDoPedido item){
        if(fechado == false){
            itens.remove(item);
            total -= item.calcularPrecoTotal();
        }
        else{
            System.out.println("O pedido ja foi fechado!");
        }
    }
    
    public void fecharPedido(){
        this.fechado = true;
    }
    
    public void reabrirPedido(){
        this.fechado = false;
    }
    
    // Ainda tá faltando coisa

    public int getId(){
        return id;
    }

    public Mesa getMesa(){
        return mesa;
    }

    public List<ItemDoPedido> getItens(){
        return itens;
    }

    public boolean isFechado(){
        return fechado;
    }
}
