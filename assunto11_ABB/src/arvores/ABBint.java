package arvores;

public class ABBint 
{
	
	private class ARVORE
	{
		int dado;
		ARVORE esq, dir;
	}
	
	//Árvore vazia sempre a raiz é apontada para null
	public ARVORE root = null;
	
	//Método inserir dados na ÁRVORE 
	//p = Endereço do nó com dado
	//info = É o número que estamos inserindo 
	public ARVORE inserir(ARVORE p, int info) 
	{
		// Insere elemento em uma ABB
		if (p == null) 
		{
			p = new ARVORE();
			p.dado = info;
			p.esq = null;
			p.dir = null;
		}
		else if (info < p.dado) 
			p.esq= inserir (p.esq, info);
		     else
			p.dir=inserir(p.dir, info);	
		return p;
	}
	
	public int contaNos(ARVORE p, int cont)
	{
		if (p!=null) 
		{
			cont++;
			cont = contaNos(p.esq,cont);
			cont = contaNos(p.dir,cont);
		}
		return cont;
	}
	
	//Método de consulta da ÁRVORE 
	public boolean consulta(ARVORE p, int info)
	{
		if(p == null)
			return false;
		else
		{
			if(p.dado == info)
				return true;
			else
			{
				if(info < p.dado)
					return consulta(p.esq, info);
				else
					return consulta(p.dir, info);
			}
		}
	}
	
	//Método conta quantas consultas realizou para chegar no dado
	public int contaConsulta(ARVORE p, int info, int cont)
	{
		if(p != null)
		{
			cont++;
			if(p.dado == info)
				return cont;
			else
			{
				if(info < p.dado)
					cont = contaConsulta(p.esq, info,cont);
				else
					cont = contaConsulta(p.dir, info, cont);
			}
		}
		return cont;
	}
	
	//Inserindo os elementos na ÁRVORE Em Ordem
	public void listaEmOrdem(ARVORE p) 
	{
			if (p!=null) 
			{
				listaEmOrdem(p.esq);
				System.out.print(" "+ p.dado);
				listaEmOrdem(p.dir);
			}
	}
	
	public ARVORE removeValor (ARVORE p, int info)
	{
		if(p != null)
		{
			if(info == p.dado)
			{
				//Nó a ser removido é Nó folha
				if(p.esq == null && p.dir == null)
					return null;
				//Se não há sub-árvore esquerda o ponteiro passa apontar para a sub-árvore direita
				if(p.esq == null)
				{
					return p.dir;
				}
				else
				{
					//Se não há sub-árvore direita o ponteiro passa apontar para a sub-árvore esquerda
					if(p.dir == null)
					{
						return p.esq;
					}
					//O Nó a ser retirado possui sub-árvore esquerda e direita, então o Nó que será retirado deve-se encontrar o menor valor na sub-árvore à direita
					else
					{
						ARVORE aux, ref;
						ref = p.dir;
						aux = p.dir;
						while(aux.esq != null)
							aux = aux.esq;
						aux.esq = p.esq;
						return ref;
					}
				}
			}
			//Procura dado a ser removido na ABB
			else
			{
				if(info < p.dado)
					p.esq = removeValor(p.esq, info);
				else
					p.dir = removeValor(p.dir, info);
			}
		}
		
		return p;
	}
	
	
}
