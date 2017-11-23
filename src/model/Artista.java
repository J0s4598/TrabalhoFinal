package model;

public class Artista {
	//Atributos
	private String nome;
	private int idade;
	
	//Metodo Construtor
	public Artista(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	//Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//Metodo to String
	public String toString(){
		return "Nome: " + this.nome + "\n" + 
			   "Idade: " + this.idade + "\n";
	}

}
