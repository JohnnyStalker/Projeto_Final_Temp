package bean;

public class JogadorCaptain extends Jogador {
    
    private static final double MULTIPLICADOR_DE_CURTIDAS_CAPTAIN = 2.3;

    public JogadorCaptain(String nome, String sobrenome, String nickname, String email, Integer idade, String senha) {
        super(nome, sobrenome, nickname, email, idade, senha);
    }

    @Override
    public double calcularInfluencia() {
        return this.getTimeline().curtidasTotais() * MULTIPLICADOR_DE_CURTIDAS_CAPTAIN;
    }
    
}
