package domain;

public class Fila {
	
	private int idMateria;
	private String ultimaNota;
	private boolean aprobado;
	private String titulo;
	
	public int getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}
	public String getUltimaNota() {
		return ultimaNota;
	}
	public void setUltimaNota(String ultimaNota) {
		this.ultimaNota = ultimaNota;
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
