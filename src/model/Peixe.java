package model;

public class Peixe extends Animal {

	private String barbatanas;
	private String cauda;
	
	public Peixe() {
		alterarPatas(0);
		alterarAmbiente("mar");
	}

	
	
	public String caracteristica() {
	    return "Barbatanas e  Cauda";
	}

	public void alteraCaracteristica(String caracteristicas) {
	
	alterarCor("Cinza");
	
		
}
	
	public void dados () {
	System.out.println("o animal é " + getNome() + " o ambiente e " + getAmbiente() + " o comprimento e " + getComprimento() + " a quantidade de patas " + getPatas() + " e a cor do animal e " + getCor()  + " e a velocidade e " + getVelocidade() + "  " + caracteristica());
	}
	
}
