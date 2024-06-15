package Pilhas;

public class PilhaInt 
{
	//Criando uma constante N com valor = 6.
	public final int N = 6;
	
	//Vetor de dados com 6 posições.
	int dados[] = new int[N];
	
	//Topo ele faz a mesma função que o indice
	int topo;
	
	//Operação Init
	public void init()
	{
		topo = 0;
	}
	
	//Operação Push
	public void push(int elem)
	{
		if(isFull())
		{
			System.out.println("Stack overflow");
		}
		else
		{
			dados[topo] = elem;
			topo++;
		}
	}
	
	//Operação Pop
	public int pop()
	{
		topo--;
		return(dados[topo]);
	}
	
	//Operação isEmpty
	public boolean isEmpty()
	{
		if(topo == 0)
			return true;
		else
			return false;
	}
	
	//Operação isFull
	public boolean isFull()
	{
		if(topo == N)
			return true;
		else
			return false;
	}
	
	//Operação top
	//Ele não volta atrás.
	//Ele ira retirar os ultimos numeros e pega o proximo da sequencia
	//Por exemplo, ele retira 60, 50, 40 e mostra o 30 como ultimo elemento da pilha.
	//Ele faz isso pela quantidade de vezes que eu pedi para ele retirar dados da pilha.
	public int top()
	{
		return(dados[topo - 1]);
	}
	
	//Operação esvazia
	public void esvazia()
	{
		//Enquanto a pilha não estiver vazia, faz um pop
		while(!isEmpty())
			System.out.print(" "+pop());
	}
	
}
