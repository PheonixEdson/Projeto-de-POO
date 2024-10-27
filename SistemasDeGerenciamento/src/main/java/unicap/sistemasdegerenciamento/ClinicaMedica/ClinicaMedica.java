package unicap.sistemasdegerenciamento.ClinicaMedica;

import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ClinicaMedica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clinica clinica = new Clinica();
        while (true) {
            System.out.println("\nSistema de Gerenciamento Clínica Médica");
            System.out.println("1. Adicionar Paciente");
            System.out.println("2. Adicionar Médico");
            System.out.println("3. Agendar Consulta");
            System.out.println("4. Exibir Relatório de Consultas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do paciente: ");
                    String nomePaciente = scanner.nextLine();
                    
                    System.out.print("Digite o CPF do paciente: ");
                    String cpfPaciente = scanner.nextLine();
                    
                    System.out.println("Digite a idade do paciente: ");
                    int idadePaciente = scanner.nextInt();
                    
                    System.out.println("Digite o email do paciente: ");
                    String emailPaciente = scanner.nextLine();
                    
                    System.out.println("Digite o telefone do paciente: ");
                    String telefonePaciente = scanner.nextLine();
                    
                    Paciente paciente = new Paciente(nomePaciente, cpfPaciente, idadePaciente, emailPaciente, telefonePaciente);
                    clinica.adicionarPaciente(paciente);
                    
                    System.out.println("Paciente adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o nome do médico: ");
                    String nomeMedico = scanner.nextLine();
                    System.out.print("Digite a especialidade do médico: ");
                    String especialidadeMedico = scanner.nextLine();
                    Medico medico = new Medico(nomeMedico, especialidadeMedico);
                    clinica.adicionarMedico(medico);
                    System.out.println("Médico adicionado com sucesso!");
                    break;
                case 3:
                    System.out.print("Digite o nome do paciente: ");
                    String nomePacienteConsulta = scanner.nextLine();
                    Paciente pacienteConsulta = clinica.buscarPacientePorNome(nomePacienteConsulta);
                    if (pacienteConsulta == null) {
                        System.out.println("Paciente não encontrado.");
                        break;
                    }
                    System.out.print("Digite o nome do médico: ");
                    String nomeMedicoConsulta = scanner.nextLine();
                    Medico medicoConsulta = clinica.buscarMedicoPorNome(nomeMedicoConsulta);
                    if (medicoConsulta == null) {
                        System.out.println("Médico não encontrado.");
                        break;
                    }
                    clinica.agendarConsulta(pacienteConsulta, medicoConsulta, new Date());
                    break;
                case 4:
                    clinica.buscarConsultas();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
