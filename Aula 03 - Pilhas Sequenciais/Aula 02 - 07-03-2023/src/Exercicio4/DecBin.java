package Exercicio4;

import java.util.Scanner;

import Pilhas.PilhaInt;

public class DecBin 
{

	public static void main(String[] args)
	{
		PilhaInt pilha = new PilhaInt();
		pilha.init();
		
		Scanner teclado = new Scanner(System.in);
		int resto, decimal;
		
		System.out.println("Informe valor decimal: ");
		decimal = teclado.nextInt();
		
		while(decimal != 0)
		{
			resto = decimal % 2;
			pilha.push(resto);
			decimal = decimal / 2;
		}
		
		System.out.println("Valor em binário: ");
		pilha.esvazia();
		
		teclado.close();

	}

}
