package domain;

public class NotaConceptual implements Nota {
	
	private String value;
	
	@Override
	public boolean esNotaAprobada() {
		return value.charAt(0) == 'B';
	}
		
}