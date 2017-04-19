package view;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import viewModels.LectorViewModel;

public class LectorView extends SimpleWindow<LectorViewModel> {

	public LectorView(WindowOwner parent) {
		super(parent, new LectorViewModel());
	}

	@Override
	protected void addActions(Panel panelActions) {
		new Button(panelActions) //
		    .setCaption("Confirmar Token de ingreso") //
		    .onClick(() -> { getModelObject().validarToken(); this.nuevoDialogo(); });
	}

	  @Override
	  public void createFormPanel(Panel mainPanel) {
	    
		  setTitle("Lector de Notas");
		  mainPanel.setLayout(new VerticalLayout());
		  
		  new Label(mainPanel).setText("¡Bienvenido al Lector de notas!");
		    
		  new Label(mainPanel).setText("Ingrese su token");
		    
		  new TextBox(mainPanel).setWidth(250).bindValueToProperty("tokenUsuario");
		  
	  }

	  public void nuevoDialogo() {
		  this.openDialog(new MenuOpcionesView(this, this.getModelObject().getModelo()));
	  }

	  protected void openDialog(Dialog<?> dialog) {
		   dialog.open();
		   dialog.onAccept(()->{});
	  }


}  
