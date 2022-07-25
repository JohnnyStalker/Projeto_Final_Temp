
package midia;

public class Imagem extends Midia {
	protected String resolucao;
	
	public Imagem(String caminhoMidia, String resolucao) {
		super(caminhoMidia);
		this.resolucao = resolucao;
	}
	
	public String getResolucao() {
            return resolucao;
        }

        public void setResolucao(String resolucao) {
            this.resolucao = resolucao;
        }
	
	@Override
	public String getCaminhoMidia() {
		return caminhoMidia;
	}
	
	@Override
	public String toString() { //+Imagem
		return "\n" + getClass().getSimpleName() + "\nOrigem: " + this.caminhoMidia + "\nResolução: " + this.getResolucao();	
	}
	
	
}
