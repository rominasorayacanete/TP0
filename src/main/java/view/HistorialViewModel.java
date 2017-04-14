package view;

import java.util.List;

import org.uqbar.commons.utils.Observable;

import domain.Fila;
import domain.LectorModel;

@Observable
public class HistorialViewModel {
	
	private LectorModel modelo; 
	
	public LectorModel getModelo(){
		return modelo;
	}

	public void setModelo(LectorModel model){
		modelo = model;
	}

	

	
}
