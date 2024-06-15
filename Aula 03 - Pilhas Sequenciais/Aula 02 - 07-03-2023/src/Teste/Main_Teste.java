package Teste;

//Lembrar de fazer a importação para ter ligação entre os dois packages
import Pilhas.PilhaInt;

public class Main_Teste 
{

	public static void main(String[] args) 
	{
		//Chamando o objeto
		PilhaInt pilha = new PilhaInt();
		
		//Primeira Operação sempre é o Init
		//Para ela sempre começar vazia
		pilha.init();
		
		//Operação Push
		//Adicionando valores dentro da pilha
		//12, 10, ...
		pilha.push(10);		
		pilha.push(20);
		pilha.push(30);		
		pilha.push(40);
		pilha.push(50);		
		pilha.push(60);	
		
		//Se a pilha não (!) estiver vazia ele mostra a quantidade, senão, ele fala que esta vazia
		if(!pilha.isEmpty())
			System.out.println("Valor do dado do topo da pilha: " + pilha.top());
		else
			System.out.println("Pilha vazia");
		/*
		if(!pilha.isEmpty())
			System.out.println("Valor retirado da pilha: " + pilha.pop());
		else
			System.out.println("Pilha vazia");
		
		if(!pilha.isEmpty())
			System.out.println("Valor retirado da pilha: " + pilha.pop());
		else
			System.out.println("Pilha vazia");
		*/
		
		System.out.println("Esvaziando a pilha...");
		pilha.esvazia();
		
	}

}
