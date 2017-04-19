package view;

import org.uqbar.arena.bindings.NotNullObservable;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import domain.LectorModel;
import viewModels.ActualizarDatosViewModel;

public class ActualizarDatosView extends Dialog<ActualizarDatosViewModel> {

	public ActualizarDatosView(WindowOwner parent, LectorModel model) {
		super(parent, new ActualizarDatosViewModel());
		getModelObject().setModelo(model);
	}

	@Override
	public void createFormPanel(Panel mainPanel) {
		
		setTitle("Actualice sus datos");

		new Label(mainPanel).setText("Nuevo nombre: ");

		new TextBox(mainPanel).bindValueToProperty("nuevoNombre");

		new Label(mainPanel).setText("Nuevo apellido:" );
			
		new TextBox(mainPanel).bindValueToProperty("nuevoApellido");

		new Label(mainPanel).setText("Nuevo usuario de Github: ");

		new TextBox(mainPanel).bindValueToProperty("nuevoGitUser");
		
		new Label(mainPanel).setWidth(200).bindValueToProperty("verificadorActualizacion");

	}

	@Override
	public void addActions(Panel actionPanel) {
		new Button(actionPanel) //
			.setCaption("Actualizar Datos") //
			.onClick(() -> getModelObject().actualizarDatos());
	}

}
