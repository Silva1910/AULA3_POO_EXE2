package model;

public class Mamifero extends Animal {

	private String alimento = "  ";
	public Mamifero() {
		// TODO Auto-generated constructor stub
	}

	



		
		public void alteraAlimento(String alimento) {
			this.alimento = alimento;
			
		}
		public String alimento() {
		    return alimento;
		}
		
		public void dados () {
			System.out.println("o animal é " + getNome() + " o ambiente e " + getAmbiente() + " o comprimento e " + getComprimento() + " a quantidade de patas " + getPatas() + " e a cor do animal e " + getCor()  + "e a velocidade e " + getVelocidade() +"  " + alimento );
		}

	
}
