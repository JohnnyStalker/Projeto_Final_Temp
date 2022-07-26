package testes;

import midia.Midia;
import midia.Audio;
import midia.Video;
import midia.Imagem;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MidiaTeste {
	
	@Test
	public void testeGetCaminho() {
		Midia midia = new Audio("src", "time");
		Assert.assertEquals("src", midia.getCaminhoMidia());
		System.out.println("Passou!");
	}
	
	@Test
	public void testeToString() {
		Midia midia = new Audio("src", "time");
		Assert.assertEquals(("\n" + "Audio" + "\nOrigem: " + "src" + "\nDuração: " + "time"), midia.toString());
		System.out.println("Passou!");
	}
	
	@Test
	public void testeMidiasUnits() {
		Audio audio = new Audio("src", "par");
		Video video = new Video("src", "par");
		Imagem imagem = new Imagem("src", "par");
		Assert.assertEquals("par", audio.getDuracao());
		Assert.assertEquals("par", video.getDuracao());
		Assert.assertEquals("par", imagem.getResolucao());
		System.out.println("Passou!");
	}
}
