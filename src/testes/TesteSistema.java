package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import bean.Jogador;
import bean.JogadorCaptain;
import bean.JogadorNoob;
import sistema.Sistema;

public class TesteSistema {
	
	@Test
	public void testeAdicionarJogadorCaptain() {
		Sistema sistema = new Sistema();
		Jogador jogador = new JogadorCaptain("test", "test", "test", "test", 20, "test");
		sistema.adicionarJogadorCaptain("test", "test", "test", "test", 20, "test");
		assertEquals(jogador.getNickname(), sistema.getListaJogadores().get(0).getNickname());
		System.out.println("Passou!");
		
	}
	
	@Test
	public void testeAdicionarJogadorNoob() {
		Sistema sistema = new Sistema();
		Jogador jogador = new JogadorNoob("test", "test", "test", "test", 20, "test");
		sistema.adicionarJogadorNoob("test", "test", "test", "test", 20, "test");
		assertEquals(jogador.getNickname(), sistema.getListaJogadores().get(0).getNickname());
		System.out.println("Passou!");
	}
	
	@Test
	public void testeRemoverJogador() {
		Sistema sistema = new Sistema();
		Sistema sistemaaux = new Sistema();
		sistemaaux.adicionarJogadorCaptain("test", "test", "test", "test", 22, "test");
		sistema.adicionarJogadorNoob("test", "test", "test", "test", 21, "test");
		sistema.adicionarJogadorCaptain("test", "test", "test", "test", 22, "test");
		sistema.removerJogador(sistema.getListaJogadores().get(0));
		assertEquals(sistema.getListaJogadores().toString(), sistemaaux.getListaJogadores().toString());
		System.out.println("Passou!");
	}
	
	@Test
	public void testeAtualizarNicknameJogador() {
		Sistema sistema = new Sistema();
		sistema.adicionarJogadorCaptain("test", "test", "test", "test", 22, "test");
		sistema.atualizarNicknameJogador(sistema.getListaJogadores().get(0), "test2");
		assertEquals(sistema.getListaJogadores().get(0).getNickname(), "test2");
		System.out.println("Passou!");
	}
	
	@Test
	public void testeAtualizarEmailJogador() {
		Sistema sistema = new Sistema();
		sistema.adicionarJogadorCaptain("test", "test", "test", "test", 22, "test");
		sistema.atualizarEmailJogador(sistema.getListaJogadores().get(0), "test2");
		assertEquals(sistema.getListaJogadores().get(0).getEmail(), "test2");
		System.out.println("Passou!");
	}
	
	@Test
	public void testeAtualizarIdadeJogador() {
		Sistema sistema = new Sistema();
		sistema.adicionarJogadorCaptain("test", "test", "test", "test", 22, "test");
		sistema.atualizarIdadeJogador(sistema.getListaJogadores().get(0), 23);
		assertEquals(sistema.getListaJogadores().get(0).getIdade(), 23);
		System.out.println("Passou!");
	}
	
	@Test
	public void testeAtualizarSenhaJogador() {
		Sistema sistema = new Sistema();
		sistema.adicionarJogadorCaptain("test", "test", "test", "test", 22, "test");
		sistema.atualizarSenhaJogador(sistema.getListaJogadores().get(0), "test2");
		assertEquals(sistema.getListaJogadores().get(0).getSenha(), "test2");
		System.out.println("Passou!");
	}
	
	@Test
	public void testeAtualizarNomeJogador() {
		Sistema sistema = new Sistema();
		sistema.adicionarJogadorCaptain("test", "test", "test", "test", 22, "test");
		sistema.atualizarNomeJogador(sistema.getListaJogadores().get(0), "test2");
		assertEquals(sistema.getListaJogadores().get(0).getNome(), "test2");
		System.out.println("Passou!");
	}
	
	@Test
	public void testeAtualizarSobrenomeJogador() {
		Sistema sistema = new Sistema();
		sistema.adicionarJogadorCaptain("test", "test", "test", "test", 22, "test");
		sistema.atualizarSobrenomeJogador(sistema.getListaJogadores().get(0), "test2");
		assertEquals(sistema.getListaJogadores().get(0).getSobrenome(), "test2");
		System.out.println("Passou!");
	}
	
	@Test
	public void testeAdicionarJogo() {
		Sistema sistema = new Sistema();
		sistema.AdicionarJogo(0, "test");
		assertEquals(sistema.getJogosSistema().get(0).getNome(), "test");
		System.out.println("Passou!");
	}
	
	@Test
	public void testeRemoverJogo() {
		Sistema sistema = new Sistema();
		sistema.AdicionarJogo(1, "test1");
		sistema.AdicionarJogo(2, "test2");
		sistema.removerJogo(sistema.getJogosSistema().get(0).getId());
		assertEquals(sistema.getJogosSistema().get(0).getNome(), "test2");
		System.out.println("Passou!");
	}
	
	@Test
	public void testeAtualizarNomeJogo() {
		Sistema sistema = new Sistema();
		sistema.AdicionarJogo(1, "test1");
		sistema.atualizarNomeJogo(sistema.getJogosSistema().get(0), "test2");
		assertEquals(sistema.getJogosSistema().get(0).getNome(), "test2");
		System.out.println("Passou!");
	}
	
	@Test
	public void testeAtualizarPrecoJogo() {
		Sistema sistema = new Sistema();
		sistema.AdicionarJogo(1, "test1");
		sistema.atualizarPrecoJogo(sistema.getJogosSistema().get(0), 2);
		assertEquals(sistema.getJogosSistema().get(0).getPreco(), 2);
		System.out.println("Passou!");
	}
	
	@Test
	public void testeBuscarJogador() {
		Sistema sistema = new Sistema();
		sistema.adicionarJogadorCaptain("test", "test", "test", "test", 22, "test");
		assertEquals(sistema.buscarJogador("test", "test"), sistema.getListaJogadores().get(0));
		System.out.println("Passou!");
	}
}
