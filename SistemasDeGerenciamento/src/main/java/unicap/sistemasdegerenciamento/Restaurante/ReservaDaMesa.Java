package unicap.sistemasdegerenciamento.Restaurante;

import java.time.LocalDateTime;

public class Reserva {
    private String nomeCliente;
    private int numeroPessoas;
    private LocalDateTime horaReserva;

    public Reserva(String nomeCliente, int numeroPessoas, LocalDateTime horaReserva) {
        this.nomeCliente = nomeCliente;
        this.numeroPessoas = numeroPessoas;
        this.horaReserva = horaReserva;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public LocalDateTime getHoraReserva() {
        return horaReserva;
    }
}
