package Familia28;

public class Cavalo extends Animal {
	
	private float velocidade;
	private String sono;

	
	public Cavalo( String nome, int idade, float velocidade, String sono)
	{
		super(nome,idade);
		this.velocidade = velocidade;
		this.sono = sono;
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println("\n Relincha");
	}
	@Override
	public void possibilidade()
	{
		System.out.println("\n Cavalga");
	}

	public float getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}


	public String getSono() {
		return sono;
	}


	public void setSono(String sono) {
		this.sono = sono;
	}
	
	public void ImprimirInfosCavalo()
	{
		System.out.println("\nNome do cachorro: "+getNome()+" Idade: "+getIdade()+"\nVelocidade: "+velocidade+" Sono: "+sono);
	}
	
	

}
