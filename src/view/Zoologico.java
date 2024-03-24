package view;


import model.Mamifero;
import model.Peixe;

public class Zoologico {

	public static void main(String[] args) {
	Mamifero Camelo = new Mamifero();
	Mamifero Urso_do_canada = new Mamifero();
	Peixe  Tubarao = new Peixe();
	
	Camelo.alterarNome("CAMELO");
	Camelo.alterarComprimento(150);
	Camelo.alterarCor("Amarelo");
	Camelo.alterarVelocidade(2.0f);
	
	Urso_do_canada.alterarNome("URSO DO CANADA");
	Urso_do_canada.alterarComprimento(180);
	Urso_do_canada.alterarCor("VERMELHO");
	Urso_do_canada.alterarVelocidade(0.5f);
	Urso_do_canada.alteraAlimento("Mel");
		
	
	Tubarao.alterarNome("TUBARAO");
	Tubarao.alterarComprimento(300);
	Tubarao.alterarCor("Cinzento");
	Tubarao.alterarVelocidade(1.5f);
	
	
	
	Urso_do_canada.dados();
	Camelo.dados();
	
	
	Tubarao.dados();
	}

}
