package sistema;

import bean.Jogador;
import bean.JogadorCaptain;
import bean.JogadorNoob;
import bean.Jogo;
import midia.Audio;
import midia.Imagem;
import midia.Video;
import post.Post;
public class Main {
    
    public static void main(String[] args) {
    	Post post1 = new Post("It can heal all diseases", 65);
    	post1.adicionarMidia(new Imagem("/home/Cherry_Tree.png", "1980x1080"));
    	
    	Post post2 = new Post("Kaizoku Oni Ore Wa Naru", 65);
    	post2.adicionarMidia(new Video("/home/Me_In_My_Ship.mp4", "12:39"));
    	post2.adicionarMidia(new Audio("/home/My_Promisse.mp3", "3:32"));
    	
    	Jogador jogador1 = new JogadorNoob("Tony", "Tony", "Choppa", "TonyTonyChoppa@Strawhats.com", 21, "MrHiriluk");
    	Jogador jogador2 = new JogadorCaptain("Monkey", "D. Luffy", "Mugiwara", "Mugiwara@Strawhats.com", 23, "KaizokuOni");
    	
    	jogador1.adicionarJogo(new Jogo(187.30, "GoodOfFar"));
    	jogador1.adicionarJogo(new Jogo(120.20, "LauraProoft"));
    	jogador1.adicionarPost(post1);
    	
    	jogador2.adicionarJogo(new Jogo(200, "BeTheKing"));
    	jogador2.adicionarJogo(new Jogo(56.56, "BeingTheKing"));
    	jogador2.adicionarPost(post2);
    	
    	System.out.println(jogador1.toString());
    	System.out.println(jogador1.imprimirJogos());
    	System.out.println(jogador1.getTimeline().visualizarPosts());
    	System.out.println("Influência: " + jogador1.calcularInfluencia());
    	
    	System.out.println(jogador2.toString());
    	System.out.println(jogador2.imprimirJogos());
    	System.out.println(jogador2.getTimeline().visualizarPosts());
    	System.out.println("Influência: " + jogador2.calcularInfluencia());
    }
    
}
