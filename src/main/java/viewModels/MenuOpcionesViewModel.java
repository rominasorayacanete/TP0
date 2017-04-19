package viewModels;

import org.uqbar.commons.utils.Dependencies;
import org.uqbar.commons.utils.Observable;

import domain.LectorModel;

@Observable

public class MenuOpcionesViewModel {

	private LectorModel modelo; 
	
	@Dependencies("modelo")
	public String getMensajeBienvenida() {
		return "Hola " + modelo.nombreDelEstudiante() + "!";
	}
	
	public LectorModel getModelo(){
		return modelo;
	}

	public void setModelo(LectorModel model){
		modelo = model;
	}
	
}

