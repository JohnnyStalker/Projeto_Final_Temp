package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import bean.Jogador;
import bean.JogadorCaptain;
import bean.JogadorNoob;
import bean.Jogo;
import post.Post;

public class JogadorTeste {
	
	@Test
	public void testeAdicionarJogo() {
		Jogador jogador1 = new JogadorCaptain("test", "test", "test", "test", 20, "test");
		jogador1.adicionarJogo(new Jogo(1, "test"));
		if(jogador1.imprimirJogos().equals(("" + new Jogo(1, "test"))))
			System.out.println("Passou!");
	}
	
	@Test
	public void testeRemoverJogo() {
		Jogador jogador1 = new JogadorNoob("test", "test", "test", "test", 20, "test");
		jogador1.adicionarJogo(new Jogo(1, "test1"));
		jogador1.adicionarJogo(new Jogo(2, "test2"));
		jogador1.removerJogo(new Jogo(1, "test2"));
		if(jogador1.imprimirJogos().equals(("" + new Jogo(2,"test2"))))
			System.out.println("Passou!");
	}

	@Test
	public void testeImprimirJogos() {
		Jogador jogador1 = new JogadorNoob("test", "test", "test", "test", 20, "test");
		jogador1.adicionarJogo(new Jogo(1, "test1"));
		if (jogador1.imprimirJogos().equals("" + new Jogo(1, "test1")))
			System.out.println("Passou!");
	}
	
	@Test
	public void testeAdicionarPost() {
		List<Post> lista = new ArrayList<>();
		lista.add(new Post("test", 1));
    	Jogador jogador1 = new JogadorNoob("test", "test", "test", "test", 20, "test");
    	jogador1.adicionarPost(new Post("test", 1));
    	if (jogador1.getTimeline().getListaPostsPublicados().toString().equals(lista.toString()))
    		System.out.println("Passou!");
    }
    
	@Test
	public void testeRemoverPost() {
		List<Post> lista = new ArrayList<>();
		Post post1 = new Post("test", 1);
		Post post2 = new Post("test", 2);
		lista.add(post2);
    	Jogador jogador1 = new JogadorNoob("test", "test", "test", "test", 20, "test");
    	jogador1.adicionarPost(post1);
    	jogador1.adicionarPost(post2);
    	jogador1.removerPost(post1);
    	
    	if (jogador1.getTimeline().getListaPostsPublicados().toString().equals(lista.toString()))
    		System.out.println("Passou!");
	}
	
	@Test
	public void testeCalcularInfluenciaUnits() {
		Jogador jogadorC = new JogadorCaptain("test", "test", "test", "test", 20, "test");
		Jogador jogadorN = new JogadorNoob("test", "test", "test", "test", 20, "test");
		jogadorC.adicionarPost(new Post("test", 1));
		jogadorN.adicionarPost(new Post("test", 1));
		assertEquals(2.3, jogadorC.calcularInfluencia());
		assertEquals(1.8, jogadorN.calcularInfluencia());
		System.out.println("Passou!");
	}
}
