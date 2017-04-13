package view;

import java.util.List;

import org.uqbar.commons.utils.Observable;

import domain.Fila;
import domain.LectorModel;

@Observable
public class LectorViewModel {
	private String tokenUsuario;
	private double notas;
	private LectorModel modelo = new LectorModel();
	private String validacionToken;
	private List<Fila> filas;
	
	public void validarToken() {
		// MANEJAR EXCEPTION
		modelo.obtenerDatos(tokenUsuario);
		
		if( modelo.pudoObtenerDatos() ) validacionToken = "You have entered the matrix"; 
		else validacionToken = "You are not ready to see the truth";
		
	}
	
	public void obtenerHistorial() {
			filas = modelo.obtenerFilas(tokenUsuario);
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

	public LectorModel getModelo() {
		return modelo;
	}

	public void setModelo(LectorModel modelo) {
		this.modelo = modelo;
	}

	public String getValidacionToken() {
		return validacionToken;
	}

	public void setValidacionToken(String validacionToken) {
		this.validacionToken = validacionToken;
	}

	public List<Fila> getFilas() {
		return filas;
	}

	public void setFilas(List<Fila> filas) {
		this.filas = filas;
	}
	
	
	
}



