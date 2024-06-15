package filas;

public class FilaPaciente 
{
	private class NO
	{
		Paciente dado;
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
	public void enqueue(Paciente elem)
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
	public Paciente dequeue()
	{
		Paciente valor = ini.dado;
		ini = ini.prox;
		
		if(ini == null)
			fim = null;
		return valor;
	}
	
	//Método First
	public Paciente first()
	{
		return ini.dado;
	}
}
