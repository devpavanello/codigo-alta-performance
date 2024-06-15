package Exercicio_05;

import java.util.Scanner;

import Filas.FilaString;

public class Consultorio 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int opcao;

		// Instanciando o objeto
		FilaString filaPaciente = new FilaString();

		filaPaciente.init();
		
		do 
		{
			System.out.println("0 - Encerra o programa");
			System.out.println("1 - Insere paciente na fila");
			System.out.println("2 - Retira o paciente da fila");
			opcao = teclado.nextInt();
			
			switch (opcao) 
			{
			case 0:
				if (filaPaciente.isEmpty())
				{
					System.out.println("Encerrado!");
					opcao = 3;
				} else
					System.out.println("Não foi possivel encerrar, a fila está cheia!");
				break;
				
			case 1:
				teclado.nextLine();
				System.out.println("Nome: ");
				String nome = teclado.nextLine();
				filaPaciente.enqueue(nome);
				break;
				
			case 2:
				if(filaPaciente.isEmpty())
					System.out.println("Não ha pacientes aguardando na fila");
				else
					System.out.println("Paciente retirado da fila: " + filaPaciente.dequeue());
				break;
				
			default:
				System.out.println("Opção Inválida!");
			}
		} while (opcao != 3);

		teclado.close();
	}
}
