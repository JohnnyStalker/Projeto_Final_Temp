
package midia;

public class Audio extends Midia {
	protected String duracao;

	public Audio(String caminhoMidia, String duracao) {
		super(caminhoMidia);
		this.duracao = duracao;
	}

	@Override
	public String getCaminhoMidia() {
		return caminhoMidia;
	}

	public String audio() {
		return duracao;
	}
	
	@Override
	public String toString() { //+Audio
		return "\n" + getClass().getSimpleName() + "\nOrigem: " + this.caminhoMidia + "\nDuração: " + audio();
	}
}