package view;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import domain.LectorModel;
import viewModels.MenuOpcionesViewModel;

public class MenuOpcionesView extends Dialog<MenuOpcionesViewModel> {

	public MenuOpcionesView(WindowOwner parent, LectorModel model) {
		
		super(parent, new MenuOpcionesViewModel());
		this.getModelObject().setModelo(model);
	}

	@Override
	protected void addActions(Panel panelActions) {	
		
			new Button(panelActions) //
		    .setCaption("Consultar datos de asignaciones") //
		    .onClick(() -> historialDialog());
		
			 new Button(panelActions) //
			    .setCaption("Actualizar Datos") //
			    .onClick(() -> actualizarDialog());

	}

	@Override
	public void createFormPanel(Panel mainPanel) {
		
	    setTitle("Menu");
		mainPanel.setLayout(new VerticalLayout());	     
		
		new Label(mainPanel).bindValueToProperty("mensajeBienvenida");
		
		new Label(mainPanel).setText("Elegi la accion a realizar");
		
	}

	public void historialDialog() {
   		this.openDialog(new HistorialView(this, this.getModelObject().getModelo()));
	}

	protected void openDialog(Dialog<?> dialog) {
		dialog.open();
 		dialog.onAccept(()->{});
	}

	public void actualizarDialog() {
   		this.openDialog(new ActualizarDatosView(this, this.getModelObject().getModelo()));
	}

}

