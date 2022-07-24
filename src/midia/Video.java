package midia;

public class Video extends Midia {
	protected String duracao;

	public Video(String caminhoMidia, String duracao) {
		super(caminhoMidia);
		this.duracao = duracao;
	}

	@Override
	public String getCaminhoMidia() {
		return caminhoMidia;
	}

	public String video() {
		return duracao;
	}
	
	@Override
	public String toString() { //+Video
		return "\n" + getClass().getSimpleName() + "\nOrigem: " + this.caminhoMidia + "\nDuração: " + video();
	}
}