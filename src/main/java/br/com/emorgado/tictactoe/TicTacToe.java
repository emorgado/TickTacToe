package br.com.emorgado.tictactoe;

public class TicTacToe {

	private String jogadorX;
	private String jogadorO;
	
	private Character[][] board = { { '\0', '\0', '\0' }, { '\0', '\0', '\0' }, { '\0', '\0', '\0' } };

	public TicTacToe(String jogadorX, String jogadorO ) {
		this.jogadorX = jogadorX;
		this.jogadorO = jogadorO;
	}

	public boolean temJogadores() {
		return true;
	}

	public String getJogadorX() {

		return jogadorX;
	}

	public String getJogadorO() {

		return jogadorO;
	}

	public void setJogadorO(String jogadorO) {
		this.jogadorO = jogadorO;
	}

	public void jogadorXJoga(int i) {
		throw new RuntimeException("Erro posição não existente");		
	}
}
