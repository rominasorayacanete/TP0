package view;

import java.util.List;

import org.uqbar.commons.utils.Observable;

import domain.Fila;
import domain.LectorModel;

@Observable

public class MenuOpcionesViewModel {

	private LectorModel modelo; 
	private List<Fila> filas;
	
	public void obtenerHistorial() {
		filas = modelo.obtenerFilas();

	}
	
	public List<Fila> getFilas() {
		return filas;
	}

	public void setFilas(List<Fila> filas) {
		this.filas = filas;
	}
	
	public LectorModel getModelo(){
		return modelo;
}

	public void setModelo(LectorModel model){
		modelo = model;
}
}

