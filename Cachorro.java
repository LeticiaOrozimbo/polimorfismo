package Familia28;

public class Cachorro extends Animal {
	
	private String ra�a;
	private String cor;

	
	public Cachorro ( String nome,int idade, String ra�a, String cor)
	
	{
		super(nome,idade);
		this.ra�a = ra�a;
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

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void immprmirDados()
	{
		System.out.println("\nNome do cachorro: "+getNome()+" Idade: "+getIdade()+"\nRa�a: "+ra�a+" Colora��o: "+cor);
	}

}
