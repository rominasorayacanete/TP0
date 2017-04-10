package view;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

public class DatosView extends Dialog<DatosViewModel>  {
	public DatosView(WindowOwner owner){
		super(owner, new DatosViewModel());
	}
	
	@Override
	protected void createFormPanel(Panel mainPanel) {
		Panel form = new Panel(mainPanel);
		this.setTitle("Alumno");
		form.setLayout(new  VerticalLayout());
		
		//new Button(mainPanel) //
	    //.setCaption("Consultar datos") //
	    //.onClick(() -> getModelObject());
	    
	    new Label(mainPanel).bindValueToProperty("notas"); 
	}
	
}
