package exercicio03;

import java.util.Scanner;

import filas.FilaPaciente;
import filas.FilaString;
import filas.Paciente;

public class ConsultorioPaciente 
{

	public static void main(String[] args)
	{
		Scanner le = new Scanner(System.in);

		FilaPaciente filaPacientes = new FilaPaciente();
		filaPacientes.init();
		int opcao;
		do 
		{
			System.out.println(" 0 - Encerrar atendimento");
			System.out.println(" 1 - Inserir paciente na fila");
			System.out.println(" 2 - Atender paciente");
			System.out.print("Opcao: ");
			opcao = le.nextInt();
			switch (opcao) 
			{
			case 0:
				//encerra se fila estiver vazia
				if (filaPacientes.isEmpty())
					System.out.println("Encerrado o atendimento!");
				else 
				{
					System.out.println("Ainda ha pacientes aguardando atendimento");
					opcao = -1;
				}
				break;
			case 1:
				//insere nome do paciente que entra na fila
				le.nextLine();
				System.out.print("Nome: ");
				String nome = le.nextLine();
				System.out.println("Informe idade: ");
				int idade = le.nextInt();
				Paciente pac = new Paciente(nome, idade);
				filaPacientes.enqueue(pac);
				break;
			case 2:
				//retira o proximo paciente a ser atendido da fila
				if (filaPacientes.isEmpty())
					System.out.println("Nao ha pacientes aguardando na fila");
				else
					System.out.println("Proximo paciente a ser atendido "+ filaPacientes.dequeue());
				break;
			default:
				System.out.println("Opcao Invalida!\n");
			}
		} 
		while (opcao != 0);

		le.close();
	}
}
