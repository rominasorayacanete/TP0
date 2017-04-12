package domain;

public class NotaNumerica implements Nota {
	private Integer value;

	public boolean esNotaAprobada() {
		return value > 6;
	}
	
}