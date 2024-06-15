package Filas;

public class FilaInt 
{
	//Tornando N como constante.
	public final int N = 3;
	
	//Vetor dados do tipo inteiro.
	int dados[] = new int [N];
	
	int ini, fim, cont;
	
	//Método init 
	public void init()
	{
		ini = fim = cont = 0;
	}
	
	//Método isEmpty
	public boolean isEmpty()
	{
		if(cont == 0)
			return true;
		else
			return false;
	}
	
	//Método isFull
	public boolean isFull()
	{
		if(cont == N)
			return true;
		else
			return false;
	}
	
	//Método de inserir
	public void enqueue(int elem)
	{
		if(isFull())
			System.out.println("Fila cheia!");
		else
		{
			dados[fim] = elem;
			fim = (fim + 1) % N;
			cont++;
		}
	}
	
	//Método de retirar 
	public int dequeue()
	{
		int elem = dados[ini];
		ini = (ini + 1) % N;
		cont--;
		return elem;
	}
	
	//Método first
	public int  first()
	{
		return dados[ini];
	}
	
}
