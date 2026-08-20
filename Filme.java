public class Filme {
	private String titulo;
	private int anoLancamento;
	private int duracao;

	public Filme(String titulo, int anoLancamento, int duracao) {
		this.titulo = titulo;
		this.anoLancamento = anoLancamento;
		this.duracao = duracao;
	}
	
	public String titulo {
		return titulo;
	}
	public String anoLancamento {
		return anoLancamento;
	}
	public String duracao {
		return duracao;
	}
}