package control;

import model.BD;
import view.ViewExibirMusica;

public class ControlExibirMusica {
	//Atributo
	private BD bd;
	private ViewExibirMusica vem;
	
	//Metodo construtor
	public ControlExibirMusica(BD bd){
		this.bd = bd;
		//Instanciar a view
		this.vem = new ViewExibirMusica();
	}
	//Metodo que recupera os Cliente e exibe

}
