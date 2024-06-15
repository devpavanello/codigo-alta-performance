package listas;

public class ListaIntCrescente
{
	//Instanciando objeto da classe nó para alocação de um novo nó 
	private class NO
	{
		int dado;
		NO prox;
	}
	
	private NO lista = null;
	
	//Método Insere
	public void insere(int elem)
	{
		//Alocando um novo nó
		NO novo = new NO();
		novo.dado = elem;
		
		if(lista == null)
		{
			novo.prox = null;
			lista = novo;
		}
		else
		{
			if(novo.dado < lista.dado)
			{
				//O novo Nó vai se tornar o primeiro da lista
				novo.prox = lista;
				lista = novo;
			}
			else
			{
				//O novo Nó será inserido em posição intermediaria da lista ou no final
				NO aux = lista;
				boolean achou = false;
				
				while(aux.prox!= null && !achou)
				{
					if(aux.prox.dado < novo.dado)
						aux = aux.prox;
					else
						achou = true;
				}
				novo.prox = aux.prox;
				aux.prox = novo;
			}
		}
	}
	
	//Método Remove
	public boolean remove(int valor)
	{
		boolean achou = false;
		//Verificando se o valor é o primeiro da lista
		if(lista.dado == valor)
		{
			achou = true;
			lista = lista.prox;			
		}
		else
		{
			NO aux = lista;
			while (aux.prox != null && !achou)
			{
				if (aux.prox.dado != valor)
				{
					aux = aux.prox;
				}
				else
				{
					achou = true;
					aux.prox = aux.prox.prox;
				}
			}
		}	
		return achou;
	}
	
	public int contaNos()
	{
		int cont = 0;
		//Percorre cada NÓ da lista para obter a quantidade de NÓS
		NO aux = lista;
		while(aux != null)
		{
			cont++;
			aux = aux.prox;
		}
		return cont;
	}
	
	public void apresentaMaiores(int limite)
	{
		NO aux = lista;
		System.out.println("Valores maiores do que "+ limite+" : ");
		while(aux != null)
		{
			if(aux != null)
			{
				System.out.println("\t"+ aux.dado);
			}
			aux = aux.prox;
		}
		System.out.println();
	}
	
	//Método para apresentar a lista completa
	public void apresenta()
	{
		NO aux = lista;
		
		System.out.println("\n\n******  Lista  ******");
		while(aux!= null)
		{
			System.out.println("\t " + aux.dado);
			aux = aux.prox;
		}
	}
}
