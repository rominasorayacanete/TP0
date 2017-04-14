
package domain;

import org.uqbar.commons.utils.Observable;

import interfaces.Nota;

@Observable
public class Fila {
	
	private Nota ultimaNota;
	private boolean aprobado;
	private String titulo;
	
	public Nota getUltimaNota() {
		return ultimaNota;
	}

	
	public void setUltimaNota(Nota nota) {
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
