package view;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import domain.Fila;

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
		    .onClick(() -> getModelObject().validarToken());
			
			new Button(panelActions) //
		    .setCaption("Consultar asignaciones") //
		    .onClick(() -> {getModelObject().validarToken();getModelObject().obtenerHistorial();}); // cuando hagamos mas ventanitas sacar esta segunda validacion, porque si el token no funca ni pasa a la otra ventana.... 
		
			 new Button(panelActions) //
			    .setCaption("Actualizar Datos") //
			    .onClick(() -> {getModelObject().validarToken(); getModelObject().actualizarDatos(); });

		}


	  @Override
	  public void createFormPanel(Panel mainPanel) {
	    
		  setTitle("Lector de Notas");
		    mainPanel.setLayout(new VerticalLayout());
		    
		    new Label(mainPanel).setText("Ingrese su token");
		    
		    new TextBox(mainPanel).bindValueToProperty("tokenUsuario");
		    


			new Label(mainPanel).setText("Nuevo nombre: ");

			new TextBox(mainPanel).bindValueToProperty("nuevoNombre");

			new Label(mainPanel).setText("Nuevo apellido:" );
			
			new TextBox(mainPanel).bindValueToProperty("nuevoApellido");

			new Label(mainPanel).setText("Nuevo usuario de Github: ");

			new TextBox(mainPanel).bindValueToProperty("nuevoGitUser");

			
			
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


  }  
	 

