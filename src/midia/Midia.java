package midia;


public abstract class Midia {
	protected String caminhoMidia;

	public Midia(String caminhoMidia) {
		super();
		this.caminhoMidia = caminhoMidia;
	}

	public abstract String getCaminhoMidia();
	public abstract String toString();
	
}
