package exercicio;

import java.util.Scanner;

import entidades.Aluno;
import listas.ListaAlunos;

public class Planilha 
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		ListaAlunos turma = new ListaAlunos();
		int rm;
		double media;
		
		int resp = 1;
		do 
		{
			System.out.println("\t RM: ");
			rm = teclado.nextInt();
			System.out.println("\t Média:");
			media = teclado.nextDouble();
			Aluno aluno = new Aluno(rm, media);
			turma.insere(aluno);
			turma.apresenta();
			System.out.println("Deseja cadastrar mais 1 aluno? (1-sim)");
			resp = teclado.nextInt();
		}while (resp == 1);
		
		
		teclado.close();
	}

}
