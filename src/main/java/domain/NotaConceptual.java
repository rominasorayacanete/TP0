package domain;

import interfaces.Nota;

public class NotaConceptual implements Nota {
	
	private String value;
	
	public NotaConceptual(String nota){
		value = nota;
	}
	
	@Override
	public boolean esNotaAprobada() {
		return value.charAt(0) == 'B';
	}
	
	@Override
	public String toString(){
		return value;
	}
		
}