package post;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TimeLine {

    private List<Post> listaPostsPublicados;
    private int id;

    
    
    public TimeLine() {
		super();
		this.listaPostsPublicados = new ArrayList<>();
		this.id = hashCode();
	}

	public String visualizarPosts() {
    	String posts = "";
        for (Post post : listaPostsPublicados) {
            posts = posts + post;
        }
        return posts;
    }
    
    public int curtidasTotais(){
        int curtidasTotais = 0;
        for (Post post : listaPostsPublicados) {
			curtidasTotais += post.getCurtidas();
		}
        return curtidasTotais;
    }
    
    public List<Post> getListaPostsPublicados() {
		return listaPostsPublicados;
	}
    
    public void publicarPost(Post post) {
    	listaPostsPublicados.add(post);
    }
    
    public void removerPost(Post post) {
    	for (Post p : listaPostsPublicados) {
			if(p.equals(post)) {
				listaPostsPublicados.remove(post);
			}
		}
    }
    
	@Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TimeLine other = (TimeLine) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "\n\n" + listaPostsPublicados + "\nID: " + id;
    }
}
