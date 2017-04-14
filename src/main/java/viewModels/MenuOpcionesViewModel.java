package viewModels;

import org.uqbar.commons.utils.Observable;

import domain.LectorModel;

@Observable

public class MenuOpcionesViewModel {

	private LectorModel modelo; 
	
	public LectorModel getModelo(){
		return modelo;
	}

	public void setModelo(LectorModel model){
		modelo = model;
	}
	
}

