
package sistema;

import bean.Jogador;
import bean.JogadorCaptain;
import bean.JogadorNoob;
import bean.Jogo;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
    
    private List<Jogador> listaJogadores = new ArrayList<Jogador>();
    private List<Jogo> jogosSistema = new ArrayList<Jogo>();
    
    public void adicionarJogadorCaptain(String nome, String sobrenome, String nickname, String email, Integer idade, String senha){
        Jogador jogador = new JogadorCaptain(nome, sobrenome, nickname, email, idade, senha);
        listaJogadores.add(jogador);
    }
    public void adicionarJogadorNoob(String nome, String sobrenome, String nickname, String email, Integer idade, String senha){
        Jogador jogador = new JogadorNoob(nome, sobrenome, nickname, email, idade, senha);
        listaJogadores.add(jogador);
    }
    
    public boolean removerJogador(Jogador jogador){
        for(Jogador jogadorRegistrado : listaJogadores){
            
            if(jogadorRegistrado.equals(jogador)){
                listaJogadores.remove(jogadorRegistrado);
                return true;
            }
        }
        
        return false;
    }
    
    public boolean atualizarNicknameJogador(Jogador jogador, String nickname){
        
        if(nickname != null && !nickname.isEmpty()){
        
            for(Jogador jogadorRegistrado : listaJogadores){

                if(jogadorRegistrado.equals(jogador)){
                    jogadorRegistrado.setNickname(nickname);
                    return true;
                }
            }
        }
        
        return false;
    }
    public boolean atualizarEmailJogador(Jogador jogador, String email){
        
        if(email != null && !email.isEmpty()){
        
            for(Jogador jogadorRegistrado : listaJogadores){

                if(jogadorRegistrado.equals(jogador)){
                    jogadorRegistrado.setEmail(email);
                    return true;
                }
            }
        }
        
        return false;
    }
    public boolean atualizarIdadeJogador(Jogador jogador, Integer idade){
        
        if(idade != null && idade >= 18){
        
            for(Jogador jogadorRegistrado : listaJogadores){

                if(jogadorRegistrado.equals(jogador)){
                    jogadorRegistrado.setIdade(idade);
                    return true;
                }
            }
        }
        
        return false;
    }
    public boolean atualizarSenhaJogador(Jogador jogador, String senha){
        
        if(senha != null && !senha.isEmpty()){
        
            for(Jogador jogadorRegistrado : listaJogadores){

                if(jogadorRegistrado.equals(jogador)){
                    jogadorRegistrado.setSenha(senha);
                    return true;
                }
            }
        }
        
        return false;
    }
    public boolean atualizarNomeJogador(Jogador jogador, String nome){
        
        if(nome != null && !nome.isEmpty()){
        
            for(Jogador jogadorRegistrado : listaJogadores){

                if(jogadorRegistrado.equals(jogador)){
                    jogadorRegistrado.setNome(nome);
                    return true;
                }
            }
        }
        
        return false;
    }
    public boolean atualizarSobrenomeJogador(Jogador jogador, String sobrenome){
        
        if(sobrenome != null && !sobrenome.isEmpty()){
        
            for(Jogador jogadorRegistrado : listaJogadores){

                if(jogadorRegistrado.equals(jogador)){
                    jogadorRegistrado.setSobrenome(sobrenome);
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public void AdicionarJogo(double preco, String nome){
        Jogo jogo = new Jogo(preco, nome);
        jogosSistema.add(jogo);
    }
    
    public boolean removerJogo(int id){
        for(Jogo jogoRegistrado : jogosSistema){
            
            if(jogoRegistrado.getId() == id){
                jogosSistema.remove(jogoRegistrado);
                return true;
            }
        }
        
        return false;
    }
    
    public boolean atualizarNomeJogo(Jogo jogo, String nome){
        
        if(nome != null && !nome.isEmpty()){
            for(Jogo jogoRegistrado : jogosSistema){

                if(jogoRegistrado.equals(jogo)){
                    jogoRegistrado.setNome(nome);
                    return true;
                }
            }
        }
        
        return false;
    }
    public boolean atualizarPrecoJogo(Jogo jogo, double preco){
        
        for(Jogo jogoRegistrado : jogosSistema){

            if(jogoRegistrado.equals(jogo)){
                jogoRegistrado.setPreco(preco);
                return true;
            }
        }
        
        return false;
    }
    
    public Jogador buscarJogador(String nickname, String email){
        
        if(nickname != null && !nickname.isEmpty() && email != null && !email.isEmpty()){
            for(Jogador jogadorRegistrado : listaJogadores){

                if(jogadorRegistrado.getEmail().equals(email) && jogadorRegistrado.getNickname().equals(nickname)){
                    return jogadorRegistrado;
                }
            }
        }
        
        return null;
    }
	public List<Jogador> getListaJogadores() {
		return listaJogadores;
	}
	public List<Jogo> getJogosSistema() {
		return jogosSistema;
	}
}
