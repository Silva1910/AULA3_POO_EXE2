package model;

public class Animal {

	private int patas = 4  ;
	private int comprimento;
	private String nome;
	private String cor;
	private String ambiente = "terra";
	private Float velocidade;

	public Animal() {
		super();

	}

	public int getPatas() {
		return patas;
	}

	public void  alterarPatas(int patas) {
		this.patas = patas;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void alterarComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public String getNome() {
		return nome;
	}

	public void alterarNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void alterarCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void alterarAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public Float getVelocidade() {
		return velocidade;
	}

	public void alterarVelocidade(Float velocidade) {
		this.velocidade = velocidade;
	}

	
	
	
}
