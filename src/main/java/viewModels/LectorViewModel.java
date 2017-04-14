package viewModels;

import org.uqbar.commons.utils.Observable;

import domain.LectorModel;

@Observable
public class LectorViewModel {
	
	private String tokenUsuario;
	private LectorModel modelo = new LectorModel(); 
	
	public void validarToken() {
		modelo.obtenerDatos(tokenUsuario);
	}

	public String getTokenUsuario() {
		return tokenUsuario;
	}

	public void setTokenUsuario(String tokenUsuario) {
		this.tokenUsuario = tokenUsuario;
	}

	public LectorModel getModelo() {
		return modelo;
	}

	public void setModelo(LectorModel modelo) {
		this.modelo = modelo;
	}

}
