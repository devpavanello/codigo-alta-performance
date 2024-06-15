package Exercicio_03;

import java.util.Scanner;

import Filas.FilaInt;

public class AtendeAluno 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int opcao;

		// Instanciando o objeto
		FilaInt filaAlunos = new FilaInt();

		filaAlunos.init();
		
		do 
		{
			System.out.println("0 - Encerra o programa");
			System.out.println("1 - Insere aluno na fila");
			System.out.println("2 - Retira o aluno da fila");
			opcao = teclado.nextInt();
			
			switch (opcao) 
			{
			case 0:
				if (filaAlunos.isEmpty())
				{
					System.out.println("Encerrado!");
					opcao = 3;
				} else
					System.out.println("Não foi possivel encerrar, a fila está cheia!");
				break;
			case 1:
				System.out.println("Informe seu RM: ");
				int rm = teclado.nextInt();
				filaAlunos.enqueue(rm);
				break;
			case 2:
				System.out.println("Aluno retirado da fila: " + filaAlunos.dequeue());
				break;
			default:
				System.out.println("Opção Inválida!");
			}
		} while (opcao != 3);

		teclado.close();
	}
}
