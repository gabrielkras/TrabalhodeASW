package logicajogo;

public interface SaidaJogo {

	void iniciarJogo();

	void alterarElemento(Posicao posicao, Elemento novo);

	void passarDeFase();

	void perderJogo();
	
	void recarregarMapa();
	
	void mostrarMensagem(String mensagem, String titulo);
	

}
