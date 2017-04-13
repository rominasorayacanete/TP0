package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class LectorModel {
	
	private Estudiante estudiante;
	private HistorialAcademico historial;
	
	public List<Fila> obtenerFilas(String tokenUsuario){
	
		this.obtenerHistorial(tokenUsuario);
		List<Fila> filas = new ArrayList<Fila>();
		
		filas = historial.getAssignments().stream().map(this::toFila).collect(Collectors.toList());
		
		return filas;
		
	}
	
	private Fila toFila(Materia materia) {
		
		Fila fila = new Fila();
		fila.setTitulo(materia.getTitle());
		fila.setUltimaNota(materia.ultimaNota());
		fila.setAprobado(materia.aproboUltima());
		
		return fila;
		
	}

	public void obtenerHistorial(String token) {
		historial = new Gson().fromJson(this.obtenerRecurso(token, "/assignments"), HistorialAcademico.class);
	
	}

	public void obtenerDatos(String token) { 
		estudiante = new Gson().fromJson(this.obtenerRecurso(token, ""), Estudiante.class);
	}

	public boolean pudoObtenerDatos() {
		return estudiante.pudoInicializarse();
	}
			
	private String obtenerRecurso(String token, String recurso) {
		
		ClientResponse response = Client.create()
		         .resource("http://notitas.herokuapp.com")
		         .path("student" + recurso)
		         .header("Authorization", "Bearer " + token)
		         .accept(MediaType.APPLICATION_JSON) 
		         .get(ClientResponse.class);

		return response.getEntity(String.class);
				
	}
	
}

