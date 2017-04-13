package domain;

public class NotaNumerica implements Nota {
	
	private Integer value;
	
	public NotaNumerica(Integer nota){
		value = nota;
	}
	
	@Override
	public boolean esNotaAprobada() {
		return value > 6;
	}
	
	public void setValue(Integer _v){
		value = _v;
	}
	
}