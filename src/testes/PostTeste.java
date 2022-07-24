package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import midia.Audio;
import midia.Midia;
import post.Post;

public class PostTeste {
	
	@Test
	public void testeAdicionarMidia() {
		Post post = new Post("test", 1);
		Post postaux = new Post("test", 1);
		postaux.getListaMidiasPost().add(new Audio("src", "par"));
		post.adicionarMidia(new Audio("src", "par"));
		assertEquals(post.getListaMidiasPost().toString(), postaux.getListaMidiasPost().toString());
		System.out.println("Passou!");
	}
	
	@Test
	public void testeRemoverMidia() {
		Post post1 = new Post("test", 1);
		Post post2 = new Post("test", 1);
		Midia midia1 = new Audio("src1", "par1");
		Midia midia2 = new Audio("src2", "par2");
		post1.adicionarMidia(midia1);
		post1.adicionarMidia(midia2);
		post2.adicionarMidia(midia2);
		post1.removerMidia(midia1);
		assertEquals(post1.toString(), post2.toString());
		System.out.println("Passou!");
	}
	
	@Test
	public void testeCurtirPost() {
		Post post = new Post("test", 1);
		post.curtirPost();
		assertEquals(2, post.getCurtidas());
		System.out.println("Passou!");
	}
	
	@Test
	public void testeHorarioPost() {
		SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy HH:mm");  
	    Date horarioPublicacao = new Date();    
		Post post = new Post("test", 1);
		assertEquals(post.exibirHorarioPost(), formatar.format(horarioPublicacao));
		System.out.println("Passou!");
	}
}
