package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Musica;

public class ViewExibirMusica {
	//
	public void exibirMusica(ArrayList<Musica> musica){
		//
		String todasMusica = "";
		//
		for (int i = 0; i < musica.size(); i++) {
			todasMusica = todasMusica + musica.get(i).toString() + "\n";
		}
	//
		JOptionPane.showMessageDialog(null, todasMusica);
	}

}
