package view;

import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import domain.Fila;
import domain.LectorModel;
import viewModels.HistorialViewModel;

public class HistorialView extends Dialog<HistorialViewModel> {

	public HistorialView(WindowOwner parent, LectorModel model){
		super(parent, new HistorialViewModel());
		getModelObject().setModelo(model);
	}

	@Override
	public void createFormPanel(Panel mainPanel) {
		
		setTitle("Historial académico");
		
		new Label(mainPanel).setText("Registro de notas");	
		
		Table<Fila> table = new Table<Fila>(mainPanel, Fila.class);
		table.setNumberVisibleRows(10);	
		table.bindItemsToProperty("filas");
			
			new Column<Fila>(table) //
				.setTitle("Titulo")
				.setFixedSize(150)
				.bindContentsToProperty("titulo");
			
			new Column<Fila>(table) //
				.setTitle("Nota actual")
				.setFixedSize(150)
				.bindContentsToProperty("ultimaNota");
			
			new Column<Fila>(table) //
				.setTitle("Aprobado")
				.setFixedSize(100)
				.bindContentsToProperty("aprobado");
			
	}

	@Override
	public void addActions(Panel actionPanel){
	}

}
