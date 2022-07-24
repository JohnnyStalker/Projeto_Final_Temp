package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import post.Post;
import post.TimeLine;

public class TimeLineTeste {

	@Test
	public void testeCurtidasTotais() {
		TimeLine timeline = new TimeLine();
		timeline.publicarPost(new Post("test", 1));
		assertEquals(timeline.curtidasTotais(), 1);
		System.out.println("Passou!");
	}
	
	@Test
	public void testePublicarPost() {
		Post post1 = new Post("test1", 1);
		TimeLine timeline = new TimeLine();
		TimeLine auxtimeline = new TimeLine();
		timeline.publicarPost(post1);
		auxtimeline.publicarPost(post1);
		assertEquals(timeline.getListaPostsPublicados(),auxtimeline.getListaPostsPublicados());
		System.out.println("Passou!");
	}
	
	@Test
	public void testeRemoverPost() {
		Post post1 = new Post("test1", 1);
		Post post2 = new Post("test2", 1);
		TimeLine timeline = new TimeLine();
		TimeLine auxtimeline = new TimeLine();
		timeline.publicarPost(post1);
		timeline.publicarPost(post2);
		auxtimeline.publicarPost(post2);
		timeline.removerPost(post1);
		assertEquals(timeline.getListaPostsPublicados(),auxtimeline.getListaPostsPublicados());
		System.out.println("Passou!");
	}
	
}
