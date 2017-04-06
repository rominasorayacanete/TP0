package view;

import org.uqbar.commons.utils.Observable;

import domain.LectorModel;

@Observable
public class LectorViewModel {
	private String tokenUsuario;
	private double notas;
	
	public void validar() {
		
	}
	
	public void obtenerDatos() {
		
	}

	public String getTokenUsuario() {
		return tokenUsuario;
	}

	public void setTokenUsuario(String tokenUsuario) {
		this.tokenUsuario = tokenUsuario;
	}

	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}
	
	
	
}
