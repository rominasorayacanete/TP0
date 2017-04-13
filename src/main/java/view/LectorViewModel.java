package view;

import java.util.List;

import org.uqbar.commons.utils.Dependencies;
import org.uqbar.commons.utils.Observable;

import domain.Fila;
import domain.LectorModel;

@Observable
public class LectorViewModel {
	private String tokenUsuario;
	private double notas;
	private LectorModel modelo = new LectorModel();
	private List<Fila> filas;
	private String nuevoApellido;
	private String nuevoNombre;
	private String nuevoGitUser;

	
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

	public void validarToken() {
			modelo.obtenerDatos(tokenUsuario);
		
	}

	@Dependencies({"tokenUsuario"})
	public void obtenerHistorial() {
			filas = modelo.obtenerFilas(tokenUsuario);

	}
	
	public void actualizarDatos(){
		modelo.actualizarDatos(tokenUsuario, nuevoApellido, nuevoNombre, nuevoGitUser);
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


	public List<Fila> getFilas() {
		return filas;
	}

	public void setFilas(List<Fila> filas) {
		this.filas = filas;
	}
	
	
}
