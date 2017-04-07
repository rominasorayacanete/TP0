package domain;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class LectorModel {
	private Estudiante estudiante;

	public void obtenerDatos(String token) {
		
		ClientResponse response = Client.create()
		         .resource("http://notitas.herokuapp.com")
		         .path("student")
		         .header("Authorization", "Bearer " + token)
		         .accept(MediaType.APPLICATION_JSON) 
		         .get(ClientResponse.class);

		String jsonToString = response.getEntity(String.class);

		estudiante = new Gson().fromJson(jsonToString, Estudiante.class);

	}
	
	public boolean pudoObtenerDatos() {
		return estudiante.pudoInicializarse();
	}

}
