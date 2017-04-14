
package domain;

import java.util.Comparator;
import java.util.List;

import exceptions.NoTieneNotasException;
import interfaces.Nota;

public class Materia {

    private Integer id;
    private String title;
    private String description;
    private List<Calificacion> grades;

    public Materia() {
    }
    
    public Materia(Integer id, String title, String description, List<Calificacion> grado) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.grades = grado;
    }

    public boolean aproboUltima() {
		return this.ultimaNota().esNotaAprobada();
	}    
    
    public Nota ultimaNota() {

    	if( grades.isEmpty() ) throw new NoTieneNotasException("No hay notas!");
    	
    	return maximaNota(grades);
    	
    }
    
    private Nota maximaNota(List<Calificacion> calificaciones) {
		return calificaciones.stream().max(Comparator.comparing(c -> c.getUpdated_at())).get().getValue();
    } 
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Calificacion> getGrades() {
        return grades;
    }

    public void setGrades(List<Calificacion> grado) {
        this.grades = grado;
    }

}

