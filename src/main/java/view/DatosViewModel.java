package view;

import domain.Estudiante;

public class DatosViewModel {
	private String notas;
	private Estudiante estu;

	public String getNotas() {
		return estu.getCode();
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}
	
	
	
}
