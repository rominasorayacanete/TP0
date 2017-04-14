package domain;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.joda.time.LocalDate;
import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;
import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;

import view.LectorView;

public class LectorApplication extends Application {

	public static void main(String[] args) {
		/*Gson gson = new Gson();
		
		List<Materia> muchasMaterias = new ArrayList<>();
		
		List<Calificacion> calificaciones1= new ArrayList<>();
		calificaciones1.add(new Calificacion(1, new NotaConceptual("B"), new LocalDate(2017,1,12), new LocalDate(2017,2,19)));
		calificaciones1.add(new Calificacion(2, new NotaConceptual("R"), new LocalDate(2017,1,15), new LocalDate(2017,3,1)));
		calificaciones1.add(new Calificacion(3, new NotaConceptual("B+"), new LocalDate(2017,1,16), new LocalDate(2017,2,1)));
		calificaciones1.add(new Calificacion(4, new NotaNumerica(8), new LocalDate(2017,1,12), new LocalDate(2017,2,11)));

		Materia materia1 = new Materia(1, "TP0", null,  calificaciones1);
		
		List<Calificacion> calificaciones2= new ArrayList<>();
		calificaciones2.add(new Calificacion(5, new NotaConceptual("M"), new LocalDate(2016,9,12), new LocalDate(2017,10,19)));
		calificaciones2.add(new Calificacion(6, new NotaConceptual("B"), new LocalDate(2017,1,1), new LocalDate(2017,4,1)));
		calificaciones2.add(new Calificacion(7, new NotaConceptual("B-"), new LocalDate(2017,3,6), new LocalDate(2017,5,2)));
		calificaciones2.add(new Calificacion(8, new NotaNumerica(7), new LocalDate(2016,12,12), new LocalDate(2016,4,13)));

		Materia materia2 = new Materia(1, "TP0", null,  calificaciones2);
		
		muchasMaterias.add(materia1);
		muchasMaterias.add(materia2);
		
		HistorialAcademico historial = new HistorialAcademico(muchasMaterias);
				
		String jsonInString = gson.toJson(historial);

		Client.create()
		         .resource("http://notitas.herokuapp.com")
		         .path("student/assignments")
		         .header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho" )
		         .accept(MediaType.APPLICATION_JSON).put(jsonInString);

		*/
		new LectorApplication().start();
	}

	@Override
	protected Window<?> createMainWindow() {
		return new LectorView(this);
	}
	
}
