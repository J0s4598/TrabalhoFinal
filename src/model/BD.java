package model;

import java.util.ArrayList;

import util.DocumentReader;
import util.DocumentWriter;

public class BD {
	//Atributo
	private ArrayList<Musica> musica;
	private ArrayList<Artista> artista;
	private String fileName = "musica.txt";
	private String fileName1 = "artista.txt";
	private DocumentWriter dw;
	private DocumentReader dr;
	
	//Metodo Construtor
	public BD(){
		//Instanciar o ArrayList
		this.musica = new ArrayList<Musica>();
		this.artista = new ArrayList<Artista>();
		//Instanciar o DocumentWrite
		this.dw = new DocumentWriter();
		//Instanciar o DocumentReader
		this.dr = new DocumentReader();
	}

}
