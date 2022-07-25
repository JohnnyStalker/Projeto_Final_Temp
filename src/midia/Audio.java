
package midia;

public class Audio extends Midia {
	protected String duracao;

	public Audio(String caminhoMidia, String duracao) {
		super(caminhoMidia);
		this.duracao = duracao;
	}
	
	public String getDuracao() {
            return duracao;
        }

        public void setDuracao(String duracao) {
            this.duracao = duracao;
        }

	@Override
	public String getCaminhoMidia() {
		return caminhoMidia;
	}
	
	@Override
	public String toString() { //+Audio
		return "\n" + getClass().getSimpleName() + "\nOrigem: " + this.caminhoMidia + "\nDuração: " + this.getDuracao();
	}
}
