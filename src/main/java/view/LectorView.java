package view;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;


/**
 * Token de prueba: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho
 * Argumento de la VM (por si las moscas): -Djava.system.class.loader=org.uqbar.apo.APOClassLoader
 */
@SuppressWarnings("serial")
public class LectorView extends SimpleWindow<LectorViewModel> {

	public LectorView(WindowOwner parent) {
		super(parent, new LectorViewModel());
	}

	@Override
	protected void addActions(Panel panelActions) {
		new Button(panelActions) //
		    .setCaption("Confirmar Token de ingreso") //
		    .onClick(() -> {getModelObject().validarToken(); this.nuevoDialogo() ;});
	}


	  @Override
	  public void createFormPanel(Panel mainPanel) {
	    
		  setTitle("Lector de Notas");
		    mainPanel.setLayout(new VerticalLayout());
		    
		    new Label(mainPanel).setText("Ingrese su token");
		    
		    new TextBox(mainPanel).bindValueToProperty("tokenUsuario");
		    

					    
		  }

	  public void nuevoDialogo() {
		  this.openDialog(new MenuOpcionesView(this, this.getModelObject().getModelo()));
	  }

	  protected void openDialog(Dialog<?> dialog) {
		   dialog.open();
		   dialog.onAccept(()->{});
	  }


}  
