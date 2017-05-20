package domain;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.core.MediaType;

import org.uqbar.commons.model.UserException;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import exceptions.NoTieneNotasException;
import exceptions.TokenInvalidoException;

public class LectorModel {
	
	private Estudiante estudiante;
	private HistorialAcademico historial;
	private String token;
	
	public String nombreDelEstudiante() {
		return estudiante.getFirst_name();
	}
	
	public Estudiante getEstudiante() {
		return estudiante;
	}
	
	public List<Fila> obtenerFilas() {
		
		this.obtenerHistorial();
		List<Fila> filas = new ArrayList<Fila>();
		
		filas = mapearAFilas(historial.getAssignments());
		
		return filas;
		
	}

	private List<Fila> mapearAFilas(List<Materia> materias) {
		return materias.stream().map(this::toFila).collect(Collectors.toList());
	}
	
	private Fila toFila(Materia materia) {
		
		Fila fila = new Fila();
		fila.setTitulo(materia.getTitle());
		
		try {
			
			fila.setUltimaNota(materia.ultimaNota());
			fila.setAprobado(materia.aproboUltima());
			
		} 
		catch (NoTieneNotasException e){
		
		}
		
		return fila;

	}

	public void obtenerHistorial() {
		/*	Prueba de traer las materias de json a objetos, para saber si anda el manejo de notas
		 * 
		 * try {
			FileReader fr = new FileReader("ArchivoRober.json");
			JsonReader reader = new JsonReader(fr);
			historial = new Gson().fromJson(reader, HistorialAcademico.class);
		} catch (IOException e) {
			throw new UserException("No se encontro el archivo. Por favor, inserte una ruta valida");
		}
		*/
		
		historial = new Gson().fromJson(this.obtenerRecurso(token, "/assignments"), HistorialAcademico.class);
		
	}
	
	public void obtenerDatos(String tokenUsuario) {
		
		estudiante = new Gson().fromJson(this.obtenerRecurso(tokenUsuario, ""), Estudiante.class);
		
		if( !pudoObtenerDatos() ) throw new TokenInvalidoException("Token Invalido, ingreselo nuevamente");
		
		token = tokenUsuario;
		
	}

	public void actualizarDatos(String nuevoNombre, String nuevoApellido, String nuevoGitUser){
		
		Gson gson = new Gson();
		
		estudiante.setDatos(nuevoNombre, nuevoApellido, nuevoGitUser);
		
		String jsonInString = gson.toJson(estudiante);

		ponerRecurso("", jsonInString, token);
		
	}

	private void ponerRecurso(String recurso, String jsonInString, String tokenUsuario) {
		recurso(recurso, tokenUsuario).put(jsonInString);
	}
	
	public boolean pudoObtenerDatos() {
		return estudiante.pudoInicializarse();
	}
			
	private String obtenerRecurso(String tokenUsuario, String recurso) {
		
		ClientResponse response = getRecurso(recurso, tokenUsuario);

		return response.getEntity(String.class);
				
	}
	
	private ClientResponse getRecurso(String recurso, String tokenUsuario) {
		return recurso(recurso, tokenUsuario).get(ClientResponse.class);
	}

	private WebResource.Builder recurso(String recurso, String tokenUsuario) {
			return Client.create()
			         .resource("http://notitas.herokuapp.com")
			         .path("student" + recurso)
			         .header("Authorization", "Bearer " + tokenUsuario)
			         .accept(MediaType.APPLICATION_JSON) ;
	}
	
}


