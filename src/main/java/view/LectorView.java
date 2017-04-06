package view;
import java.awt.Color;

import javax.ws.rs.core.MediaType;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

import domain.Estudiante;

//@SuppressWarnings("serial")
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
		    .onClick(() -> getModelObject().validar());
		    
		    new Button(mainPanel) //
		    .setCaption("Consultar notas") //
		    .onClick(() -> getModelObject().obtenerDatos());
		    
		    new Label(mainPanel).bindValueToProperty("notas"); 
		   
		  }

		  public static void main(String[] args) {
		    new LectorView().startApplication();
			  ClientResponse response = Client.create()
				         .resource("http://notitas.herokuapp.com")
				         .path("student")
				         .header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho")
				         .accept(MediaType.APPLICATION_JSON) 
				         .get(ClientResponse.class);
				String jsonToString = response.getEntity(String.class);
				Estudiante est = new Gson().fromJson(jsonToString, Estudiante.class);
				
				System.out.println(jsonToString);
				System.out.println(est.getCode());
		  }
}
