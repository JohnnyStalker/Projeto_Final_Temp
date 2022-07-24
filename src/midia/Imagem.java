
package midia;

public class Imagem extends Midia {
	protected String resolucao;
	
	public Imagem(String caminhoMidia, String resolucao) {
		super(caminhoMidia);
		this.resolucao = resolucao;
	}

	@Override
	public String getCaminhoMidia() {
		return caminhoMidia;
	}

	public String imagem() {
		return resolucao;
	}
	
	@Override
	public String toString() { //+Imagem
		return "\n" + getClass().getSimpleName() + "\nOrigem: " + this.caminhoMidia + "\nResolução: " + imagem();	
	}
	
	
}