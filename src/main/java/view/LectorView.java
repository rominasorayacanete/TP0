package view;

import org.uqbar.arena.layout.VerticalLayout;

import org.json.JSONObject;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.MainWindow;

import com.google.gson.Gson;

import domain.Estudiante;
import domain.Fila;
import domain.JSONObject;

/**
 * Token de prueba: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho
 * Argumento de la VM (por si las moscas): -Djava.system.class.loader=org.uqbar.apo.APOClassLoader
 */
@SuppressWarnings("serial")
public class LectorView extends MainWindow<LectorViewModel> {

	  public LectorView() {
	    super(new LectorViewModel());
	  }

	  @Override
	  public void createContents(Panel mainPanel) {
	    setTitle("Lector de Notas");
	    mainPanel.setLayout(new VerticalLayout());
	    
	    new Label(mainPanel).setText("Ingrese su token");
	    
	    new TextBox(mainPanel).bindValueToProperty("tokenUsuario");
	    
	    new Button(mainPanel) //
	    .setCaption("Confirmar Token de ingreso") //
	    .onClick(() -> getModelObject().validarToken());

	    new Label(mainPanel).bindValueToProperty("validacionToken");

		// ++ PARTE DE MODIFICAR DATOS 

	    new Button(mainPanel) //
	    .setCaption("Consultar asignaciones") //
	    .onClick(() -> getModelObject().obtenerHistorial());

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

	  public static void main(String[] args) {
		  //new LectorView().startApplication();
		  String _code = "123";
		  String _first_name = "aquiles";
		  String _last_name = "bailoyo";
		  String _github_user = "aquiles_bailoyo";
		  
		  Estudiante estudianteConNuevosDatos = new Estudiante(_code, _first_name, _last_name, _github_user);
			Gson gson = new Gson();
			JSONObject jObject = new JSONObject();
			gson.toJson(estudianteConNuevosDatos, jObject);
		
			System.out.println(jObject);
	  }
	  
}	 


		  
	  

