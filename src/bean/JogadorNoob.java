package bean;

public class JogadorNoob extends Jogador{
    
    private static final double MULTIPLICADOR_CURTIDAS_NOOB = 1.8;

    public JogadorNoob(String nome, String sobrenome, String nickname, String email, Integer idade, String senha) {
        super(nome, sobrenome, nickname, email, idade, senha);
    }

    @Override
    public double calcularInfluencia() {
        return this.getTimeline().curtidasTotais() * MULTIPLICADOR_CURTIDAS_NOOB;
    }
}
