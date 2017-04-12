package view;

import org.uqbar.commons.utils.Observable;

import domain.LectorModel;

@Observable
public class LectorViewModel {
	private String tokenUsuario;
	private double notas;
	private LectorModel modelo = new LectorModel();
	private String validacionToken;
	
	public void validarToken() {
		
		modelo.obtenerDatos(tokenUsuario);
		
		if( modelo.pudoObtenerDatos() ) validacionToken = "You have entered the matrix"; 
		else validacionToken = "You are not ready to see the truth";
		
	}
	
	/** Cambiar nombre: este método representa a cuando el usuario aprieta el botón
	 * de consultar notas, y se confunde con el obtenerDatos() del LectorModel 
	 */
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
	
}



