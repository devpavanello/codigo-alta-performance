package exercicio2;

import java.util.Scanner;

import arvores.AVLint;

public class Exercicio2 
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		AVLint avl = new AVLint();
		int opcao, valor;
		
		do 
		{
			System.out.println(" 0 - Sair");
			System.out.println(" 1 - Inserir");
			System.out.println(" 2 - Mostrar FB dos nos");
			opcao = teclado.nextInt();

			switch (opcao) 
			{
			
			case 0:
				System.out.println(" Encerrado o programa");
				break;
				
			case 1:
				System.out.print("Informe valor: ");
				valor = teclado.nextInt();
				avl.root = avl.inserirAVL(avl.root, valor);
				avl.atualizaAlturas(avl.root);
				break;
				
			case 2:
				System.out.println("Apresentacao FB dos nos");
				avl.mostraFB(avl.root);
				System.out.println();
				break;
				
			case 3: 
				System.out.println("Informe valor a ser removido: ");
				valor = teclado.nextInt();
				avl.root = avl.removeValor(avl.root, valor);
				avl.root = avl.atualizaAlturaBalanceamento(avl.root);
				avl.atualizaAlturas(avl.root);
				break;
				
			default:
				System.out.println("Opcao Invalida");
			}
		} 
		while (opcao != 0);
			teclado.close();

	}

}
