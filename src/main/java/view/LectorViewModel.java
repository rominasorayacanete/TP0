package view;

import java.awt.List;

import org.uqbar.commons.utils.Observable;

import domain.LectorModel;

@Observable
public class LectorViewModel {
	private String tokenUsuario;
	private double notas;
	private static LectorModel modelo = new LectorModel();
	private String validacionToken;
	List<Fila> filas;

// EXCEPCION
	public void validarToken() {
		modelo.obtenerDatos(tokenUsuario);
		if( modelo.pudoObtenerDatos() ) validacionToken = "You have entered the matrix";
		else {
			validacionToken = "You are not ready to see the truth";
		}
	}
// EXCEPCION
	
	public void obtenerHistorial() {
		filas = modelo.obtenerFilas(tokenUsuario);
	}
	
	public void obtenerDatos() {
		//TODO
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

	public static LectorModel getModelo() {
		return modelo;
	}

	public static void setModelo(LectorModel modelo) {
		LectorViewModel.modelo = modelo;
	}

	public String getValidacionToken() {
		return validacionToken;
	}

	public void setValidacionToken(String validacionToken) {
		this.validacionToken = validacionToken;
	}

	
	
}


