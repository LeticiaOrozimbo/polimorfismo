package Familia28;

public class Cachorro extends Animal {
	
	private String raça;
	private String cor;

	
	public Cachorro ( String nome,int idade, String raça, String cor)
	
	{
		super(nome,idade);
		this.raça = raça;
		this.cor = cor;	
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println("\n Auauau...auauu");
	}
	
	@Override
	public void possibilidade()
	{
		System.out.println("\nCorre");
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void immprmirDados()
	{
		System.out.println("\nNome do cachorro: "+getNome()+" Idade: "+getIdade()+"\nRaça: "+raça+" Coloração: "+cor);
	}

}
