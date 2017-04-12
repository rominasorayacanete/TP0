package view;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;

import com.google.gson.Gson;

import domain.HistorialAcademico;

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

	    new Button(mainPanel) //
	    .setCaption("Consultar notas") //
	    .onClick(() -> getModelObject().obtenerDatos());
	    
	    new Label(mainPanel).bindValueToProperty("notas"); 
	   
	  }

	  public static void main(String[] args) {
		  //new LectorView().startApplication();
		  String s = "hola";//"{\"assignments\": [{\"id\": 1,\"title\": \"Primer Parcial\",\"description\": null,\"grades\": [{\"id\": 1,\"value\": 2,\"created_at\": \"2017-03-25T13:56:07.526Z\", \"updated_at\": \"2017-03-25T13:56:07.526Z\"},{\"id\": 2,\"value\": 7,\"created_at\": \"2017-03-25T13:56:07.595Z\",\"updated_at\": \"2017-03-25T13:56:07.595Z\"}]},{\"id\": 3,\"title\": \"TPA1\",\"description\": \"Primera Entrega del TP Anual\",\"grades\": [{\"id\": 4,\"value\": \"B+\",\"created_at\": \"2017-03-25T13:56:07.649Z\",\"updated_at\": \"2017-03-25T13:56:07.649Z\"}]}]}";
		  HistorialAcademico h = new Gson().fromJson(s, HistorialAcademico.class);
		  
		  System.out.println(h.getAssignments().get(0).getGrades().get(0).getValue());
		  
	  }
	  
}	  

