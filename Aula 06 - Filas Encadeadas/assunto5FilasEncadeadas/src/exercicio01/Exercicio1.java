package exercicio01;

import java.util.Scanner;

import filas.FilaInt;

public class Exercicio1 
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		//Instanciando o objeto
		FilaInt fila = new FilaInt();
		fila.init();
		
		System.out.println("Informe valor positivo (negativo para encerrar): ");
		int valor = teclado.nextInt();
		while(valor > 0)
		{
			fila.enqueue(valor);
			System.out.println("Informe valor positivo (negativo para encerrar): ");
			valor = teclado.nextInt();
		}
		
		while(!fila.isEmpty())
		{
			System.out.println("Valor retirado: " + fila.dequeue());
		}
		teclado.close();
	}
}
