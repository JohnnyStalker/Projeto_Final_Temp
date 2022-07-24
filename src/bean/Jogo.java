package bean;

public class Jogo {
	
    private int id;
    private double preco;
    private String nome;
    
    public Jogo(double preco, String nome) {
	if(nome != null && !nome.isEmpty()){
            this.id = hashCode();
            this.preco = preco;
            this.nome = nome;
        }
        else{
            System.out.println("Campos do jogo não foram preenchidos corretamente!"); 
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.id;
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
        final Jogo other = (Jogo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public String toString() {
        return "\n{ID: " + id + ", Nome: " + nome + ", Preco: " + preco + "}";
    }
    
    
}
