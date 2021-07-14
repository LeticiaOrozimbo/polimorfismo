package Familia28;

public class TesteTodosAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Cachorro Maria = new Cachorro("Maria",5,"Poodle","\nBranca");
		
		
		Maria.immprmirDados();
		Maria.emitirSom(); //
		Maria.possibilidade();
		System.out.println('\n');
		
		Cavalo Joaquim = new Cavalo("Joaquim",15,15,"Medio");
		
		Joaquim.ImprimirInfosCavalo();
		Joaquim.emitirSom();
		Joaquim.possibilidade();
		System.out.println("\n");
		
		Preguiça Joyce = new Preguiça("\nJoyce",20,"\nCholoepus","\nDefesa");
		Joyce.ImprimirInfosPregui();
		Joyce.emitirSom();
		Joyce.emitirSom();
		
		
			
	}
}
