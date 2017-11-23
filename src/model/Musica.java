package model;

public class Musica {
	//Atributo
	private String nome;
	private Artista artista;
	private Artista nacionalidade;
	
	//Metodo Construtor
	public Musica(String nome, Artista artista, Artista nacionalidade) {
		super();
		this.nome = nome;
		this.artista = artista;
		this.nacionalidade = nacionalidade;
	}

	//Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public Artista getDuracao() {
		return nacionalidade;
	}

	public void setDuracao(Artista nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	//Metodo toString
	public String toString(){
		return "Nome: " + this.nome + "\n" + 
			   "Artista: " + this.artista + "\n" + 
			   "Nacionalidade: " + this.nacionalidade + "\n";
	}
	
	

}
