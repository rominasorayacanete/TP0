package domain;

import org.uqbar.commons.utils.Observable;


@Observable
public class Fila {
	
	private String ultimaNota;
	private boolean aprobado;
	private String titulo;
	
	public String getUltimaNota() {
		return ultimaNota;
	}

	public void setUltimaNota(String nota) {
		this.ultimaNota = nota;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public boolean isAprobado() {
		return aprobado;
	}
	
	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}

}