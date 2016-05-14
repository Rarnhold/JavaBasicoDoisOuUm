package br.arnhold;

public class Player {
	
	private String nome;
	private int valorjogado;

	public int getValorjogado() {
		return valorjogado;
	}

	public void setValorjogado(int valorjogado) {
		this.valorjogado = valorjogado;
	}

	public Player(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	

}
