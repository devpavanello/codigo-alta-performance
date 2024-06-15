package filas;

public class FilaInt 
{
	private class NO
	{
		int dado;
		NO prox;
	}
	
	private NO ini, fim;
	
	//Método Init 
	public void init()
	{
		ini = fim = null;
	}
	
	//Método isEmpty para verificar se a fila está vazia
	public boolean isEmpty()
	{
		if(ini == null && fim == null)
			return true; 
		else
			return false;
	}
	
	//Método Enqueue
	public void enqueue(int elem)
	{
		NO novo = new NO();
		novo.dado = elem;
		novo.prox = null;
		
		if(isEmpty())
		{
			ini = novo;			
		}
		else
		{			
			fim.prox = novo;
		}
		fim = novo;
	}
	
	//Método dequeue
	public int dequeue()
	{
		int valor = ini.dado;
		ini = ini.prox;
		
		if(ini == null)
			fim = null;
		return valor;
	}
	
	//Método First
	public int first()
	{
		return ini.dado;
	}
}
