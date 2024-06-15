package lista2;

public class ListaEncadeada1 
{
	public static void main(String[] args) 
	{
		NO lista = new NO();
		lista.dado = 1;
		//Quando não tem proximo elemento ele recebe o valor null.
		lista.prox = null;
		
		NO novo = new NO();
		novo.dado = 2;
		novo.prox = null;
		//Apontando para o proximo elemento. 
		lista.prox = novo;
		
		NO novo2 = new NO();
		novo2.dado = 3;
		novo2.prox = lista;
		
		System.out.println("Lista: " + lista);
		System.out.println("\t Dado: " + lista.dado + "\t Prox: " + lista.prox);
		System.out.println("Novo: " + novo);
		System.out.println("\t Dado: " + novo.dado + "\t Prox: " + novo.prox);
	}
}
