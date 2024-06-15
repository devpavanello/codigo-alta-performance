package teste;

import java.util.Scanner;

import listas.ListaIntCrescente;

public class MainTeste 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		ListaIntCrescente lista = new ListaIntCrescente();
		
		//Interface para inserir valores na lista
		System.out.println("Informe dado positivo para inserir ou negativo para encerrar");
		int valor = teclado.nextInt();
		
		while(valor >= 0)
		{
			lista.insere(valor);
			lista.apresenta();
			
			System.out.println("Informe dado positivo para inserir ou negativo para encerrar");
			valor = teclado.nextInt();
		}
		
		int n = lista.contaNos();
		System.out.println("\n\n A quantidade de nos da lista = "+n);
		
		System.out.println("Informe valor limite inferior para apresentação: ");
		valor = teclado.nextInt();
		lista.apresentaMaiores(valor);
		
		//Interface para retirar valores da lista
		System.out.println("Informe dado positivo para retirar ou negativo para encerrar");
		valor = teclado.nextInt();
		
		while(valor >= 0)
		{
			if(lista.remove(valor))
				System.out.println("Valor Retirado!");
			else
				System.out.println("Valor não está na lista.");
			
			lista.apresenta();
			System.out.println("Informe dado positivo para inserir ou negativo para encerrar");
			valor = teclado.nextInt();
		}
		n = lista.contaNos();
		System.out.println("\n\n A quantidade de nos da lista = "+n);
		
		teclado.close();
	}
}
