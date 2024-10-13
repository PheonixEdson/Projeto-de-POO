package unicap.sistemasdegerenciamento.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Garcom {
    private String nome;
    private List<Mesa> mesasAtendidas;

    public Garcom(String nome) {
        this.nome = nome;
        this.mesasAtendidas = new ArrayList<>();
    }

    public void atribuirMesa(Mesa mesa) {
        mesasAtendidas.add(mesa);
    }

    public void removerMesa(Mesa mesa) {
        mesasAtendidas.remove(mesa);
    }

    public List<Mesa> getMesasAtendidas() {
        return mesasAtendidas;
    }

    public String getNome() {
        return nome;
    }

    public void listarMesasAtendidas() {
        System.out.println("Mesas atendidas por " + nome + ":");
        for (Mesa mesa : mesasAtendidas) {
            System.out.println("Mesa " + mesa.getNumero());
        }
    }
}
