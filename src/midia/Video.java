package midia;

public class Video extends Midia {
	private String duracao;

	public Video(String caminhoMidia, String duracao) {
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
	public String toString() { //+Video
		return "\n" + getClass().getSimpleName() + "\nOrigem: " + this.caminhoMidia + "\nDuração: " + video();
	}
}
