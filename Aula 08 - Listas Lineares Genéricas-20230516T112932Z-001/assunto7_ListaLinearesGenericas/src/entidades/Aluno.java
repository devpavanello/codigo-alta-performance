package entidades;

public class Aluno 
{
	int rm;
	double media;
	
	//Construtor
	public Aluno(int rm, double media) 
	{
		super();
		this.rm = rm;
		this.media = media;
	}

	//Getters and Setters
	public int getRm() 
	{
		return rm;
	}

	public void setRm(int rm)
	{
		this.rm = rm;
	}

	public double getMedia() 
	{
		return media;
	}

	public void setMedia(double media) 
	{
		this.media = media;
	}

	//To String
	@Override
	public String toString() 
	{
		return "Aluno [rm=" + rm + ", media=" + media + "]";
	}
	
	
	
	
}
