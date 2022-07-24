package testes;

public class MainTeste {
	public static void main(String[] args) {
		
		//Midia Teste
		MidiaTeste midia = new MidiaTeste();
		midia.testeGetCaminho();
		midia.testeToString();
		midia.testeMidiasUnits();
		
		System.out.println();
		
		//Jogador Teste
		JogadorTeste jogador = new JogadorTeste();
		jogador.testeAdicionarJogo();
		jogador.testeRemoverJogo();
		jogador.testeImprimirPost();
		jogador.testeAdicionarPost();
		jogador.testeRemoverPost();
		jogador.testeCalcularInfluenciaUnits();
		
		System.out.println();
		
		//Post Teste
		PostTeste post = new PostTeste();
		post.testeAdicionarMidia();
		post.testeRemoverMidia();
		post.testeHorarioPost();
		
		System.out.println();
		
		//TimeLine Teste
		TimeLineTeste timeline = new TimeLineTeste();
		timeline.testeCurtidasTotais();
		timeline.testePublicarPost();
		timeline.testeRemoverPost();
	}
}
