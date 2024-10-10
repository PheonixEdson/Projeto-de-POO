package unicap.sistemasdegerenciamento.ClinicaMedica;

public class Medico {
    private String nome;
    private String especialidade;
    private boolean disponivel;
    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.disponivel = true;  // Inicialmente disponível
    }
    public String getNome() {
        return nome;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
