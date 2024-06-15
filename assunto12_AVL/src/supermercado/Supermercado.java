package supermercado;

import java.util.Scanner;

public class Supermercado 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		//Criando objeto 
		AVLProdutos loja = new AVLProdutos();
		int opcao;
		int codigo;
		
		do 
		{
			System.out.println(" 0 - Sair");
			System.out.println(" 1 - Inserir produto");
			System.out.println(" 2 - Apresenta todos os produtos com preco menores do que um valor escolhido");
			System.out.println(" 3 - Remove um produto do cadastro da loja escolhido por seu código ");
			System.out.println(" 4 - Consulta pelo código um produto, apresentando a descrição e preço");
			
			opcao = teclado.nextInt();
	
			switch (opcao) 
			{
		
			case 0:
				System.out.println(" Encerrado o programa");
				break;
				
			case 1:
				System.out.print("Informe codigo do produto: ");
				codigo = teclado.nextInt();
				System.out.println("Descricao: ");
				String descricao = teclado.nextLine();
				System.out.println("Preco: R$ ");
				double preco = teclado.nextDouble();
				//Instanciando um objeto com paramentros
				Produto prod = new Produto(codigo, descricao, preco);
				loja.root = loja.inserirAVL(loja.root, prod);
				loja.atualizaAlturas(loja.root);
				loja.mostra(loja.root);
				break;
				
			case 2: 
				System.out.println("Informe o preco limite para listagem: R$");
				double limite = teclado.nextDouble();
				System.out.println("\n **** Lista de Produtos Mais Baratos ****");
				loja.listaMaisBaratos(loja.root, limite);
				System.out.println();
				break;
				
			case 3: 
				System.out.print("Informe codigo do produto a ser removido: ");
				codigo = teclado.nextInt();
				loja.root = loja.removeValor(loja.root, codigo);
				loja.root = loja.atualizaAlturaBalanceamento(loja.root);
				loja.atualizaAlturas(loja.root);
				loja.mostraFB(loja.root);
				break;
				
			case 4: 
				System.out.print("Informe codigo do produto a ser pesquisado: ");
				codigo = teclado.nextInt();
				Produto prodC = loja.consultaCodigo(loja.root, codigo);
				if (prodC == null)
					System.out.println("Produto nao encontrado");
				else
					System.out.println(prodC);
				break;
			default:
				System.out.println("Opcao Invalida");
			}
		} 
		while (opcao != 0);
	}
}
