package view;

import org.uqbar.commons.utils.Observable;

import domain.LectorModel;

@Observable
public class ActualizarDatosViewModel {

	private String nuevoApellido;
	private String nuevoNombre;
	private String nuevoGitUser;
	private LectorModel modelo;

	public void actualizarDatos() {
			modelo.actualizarDatos(nuevoNombre, nuevoApellido, nuevoGitUser);
	}


	public String getNuevoApellido() {
			return nuevoApellido;
	}

	public void setNuevoApellido(String nuevoApellido) {
		this.nuevoApellido = nuevoApellido;
	}

	public String getNuevoNombre() {
		return nuevoNombre;
	}

	public void setNuevoNombre(String nuevoNombre) {
		this.nuevoNombre = nuevoNombre;
	}

	public String getNuevoGitUser() {
		return nuevoGitUser;
	}

	public void setNuevoGitUser(String nuevoGitUser) {
		this.nuevoGitUser = nuevoGitUser;
	}

	public void setModelo(LectorModel model){
		modelo = model;
	}

	public LectorModel getModelo(){
		return modelo;
	}
}
