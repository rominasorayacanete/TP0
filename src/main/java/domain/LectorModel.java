package domain;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class LectorModel {
	public ClientResponse obtenerDatos() {
		
		ClientResponse response = Client.create()
		         .resource("http://notitas.herokuapp.com")
		         .path("student")
		         .header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho")
		         .accept(MediaType.APPLICATION_JSON) 
		         .get(ClientResponse.class);
		String jsonToString = response.getEntity(String.class);
		Estudiante est = new Gson().fromJson(jsonToString, Estudiante.class);
		
		return response;
		}

}
