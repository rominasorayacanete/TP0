package viewModels;

import org.uqbar.commons.utils.Observable;

import domain.LectorModel;
import exceptions.DatosVaciosException;

@Observable
public class ActualizarDatosViewModel {

	private String nuevoApellido;
	private String nuevoNombre;
	private String nuevoGitUser;
	private LectorModel modelo;
	private String verificadorActualizacion = "";

	public void actualizarDatos() {
		
		if( !sePuedeActualizar() ) throw new DatosVaciosException("Macho, no pusiste nada");
		
		modelo.actualizarDatos(nuevoNombre, nuevoApellido, nuevoGitUser);
		verificadorActualizacion = "Los datos se actualizaron correctamente";
	}
	
	public boolean sePuedeActualizar() {
		return esValido(nuevoApellido) && esValido(nuevoNombre) && esValido(nuevoGitUser);
	}
		
	private boolean esValido(String cadena) {
		return cadena!=null && !cadena.isEmpty();
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
	
	public String getVerificadorActualizacion() {
		return verificadorActualizacion;
	}

	public void setVerificadorActualizacion(String verificadorActualizacion) {
		this.verificadorActualizacion = verificadorActualizacion;
	}

}
