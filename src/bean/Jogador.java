package bean;

import java.util.ArrayList;

import post.Post;
import post.TimeLine;

public abstract class Jogador {
	
    private String sobrenome;
    private String nickname;
    private String email;
    private Integer idade;
    private String senha;
    private TimeLine timeline;
    private String nome;
    private ArrayList<Jogo> colecaoJogos;
    
    public Jogador(String nome, String sobrenome, String nickname, String email, Integer idade, String senha) {
    	if(nome != null && !nome.isEmpty() 
        	&& sobrenome != null && !sobrenome.isEmpty() 
            && nickname != null && !nickname.isEmpty() 
            && email != null && !email.isEmpty() 
            && idade != null && idade >= 18  
            && senha != null && !senha.isEmpty()) {
            
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.nickname = nickname;
            this.email = email;
            this.idade = idade;
            this.senha = senha;
            this.colecaoJogos = new ArrayList<Jogo>();
        } 
    	
    	else
    		System.out.println("Campos do usuário não foram preenchidos corretamente!");    
    }
    
    public void adicionarJogo(Jogo game) {
    	colecaoJogos.add(game);
    }
    
    public void removerJogo(Jogo game) {
    	for (Jogo jogo : colecaoJogos) {
			if (jogo.equals(game)) {
				colecaoJogos.remove(jogo);
				return;
			}
		}
    }
    
    public void imprimirJogos() {
    	for (Jogo jogo : colecaoJogos) {
			System.out.println(jogo);
		}
    }
    
    public void adicionarPost(Post post) {
    	System.out.println(timeline.toString());
    }
    
    public void removerPost(Post post) {
    	for (Post p : timeline.getListaPostsPublicados()) {
			if (p.equals(post)) {
				getTimeline().getListaPostsPublicados().remove(p);
				return;
			}
		}
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TimeLine getTimeline() {
        return timeline;
    }
    
    public abstract double calcularInfluencia();

    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", nickname=" + nickname + ", email=" + email + ", idade=" + idade + ", senha=" + senha + ", colecaoJogos=" + colecaoJogos + ", timeline=" + timeline + '}';
    }
}


