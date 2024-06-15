package supermercado;

public class Produto 
{
	//Atributos
	int codigo; 
	String descricao;
	double preco;
	
	//Construtor 
	public Produto(int codigo, String descricao, double preco)
	{
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}

	//Getters and Setters 
	public int getCodigo() 
	{
		return codigo;
	}

	public void setCodigo(int codigo)
	{
		this.codigo = codigo;
	}

	public String getDescricao() 
	{
		return descricao;
	}

	public void setDescricao(String descricao) 
	{
		this.descricao = descricao;
	}

	public double getPreco()
	{
		return preco;
	}

	public void setPreco(double preco)
	{
		this.preco = preco;
	}

	//Sobrescrita toString
	@Override
	public String toString() 
	{
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
}
