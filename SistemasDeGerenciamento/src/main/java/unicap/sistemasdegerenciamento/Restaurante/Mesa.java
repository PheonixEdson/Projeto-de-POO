package unicap.sistemasdegerenciamento.Restaurante;

public class Mesa {
    private final int numero;
    private Pedido pedido;
    private boolean ocupada;
    
    public Mesa(int numero){
        this.numero = numero;
        this.ocupada = false;
        this.pedido = new Pedido(gerarIdDoPedido(), this);
    }
    
    private int gerarIdDoPedido(){
        return (int)(Math.random() * 1000);
    }
    
    public void ocuparMesa(){
        if(ocupada == false){
            ocupada = true;
        }
        else{
            System.out.println("A mesa está ocupada!");
        }
    }
    
    public void liberarMesa(){
        ocupada = false;
        pedido = new Pedido(gerarIdDoPedido(), this);
    }

    public int getNumero(){
        return this.numero;
    }

    public Pedido getPedido(){
        return this.pedido;
    }

    public boolean isOcupada(){
        return this.ocupada;
    }
}
