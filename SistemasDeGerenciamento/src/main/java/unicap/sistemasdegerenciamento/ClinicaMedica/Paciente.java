package unicap.sistemasdegerenciamento.ClinicaMedica;

public class Paciente {
    private String nome;
    private String cpf;
    private int idade;
    private String email;
    private String telefone;
    
    public Paciente(String nome, String cpf, int idade, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}
