package Teste;

import Filas.FilaInt;

public class MainTeste 
{	
	public static void main(String[] args)
	{
		//Instanciando o objeto FilaInt
		FilaInt fila = new FilaInt();
		
		//Sempre começar com init
		fila.init();
		
		fila.enqueue(66);
		fila.enqueue(17);
		fila.enqueue(23);
		fila.enqueue(55);
		
		
		if(fila.isEmpty())
			System.out.println("Fila vazia!");
		else
			System.out.println("Valor retirado: " + fila.dequeue());
		
		if(fila.isEmpty())
			System.out.println("Fila vazia!");
		else
			System.out.println("Valor retirado: " + fila.dequeue());
		
		if(fila.isEmpty())
			System.out.println("Fila vazia!");
		else
			System.out.println("Valor retirado: " + fila.dequeue());
	}
}
