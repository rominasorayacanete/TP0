package domain;

public class NotaConceptual implements Nota {
	
	private String value;

	public boolean esNotaAprobada() {
		return value.charAt(0) == 'B';
	}
		
}