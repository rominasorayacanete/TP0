package domain;

import java.util.Comparator;
import java.util.List;

public class Materia {

    private Integer id;
    private String title;
    private String description;
    private List<Calificacion> grades;

    public Materia() {
    }
    
    public String ultimaNota() {
		return grades.stream().max(Comparator.comparing(c -> c.getValue())).get().getValue();
    }
    
    public Materia(Integer id, String title, String description, List<Calificacion> grado) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.grades = grado;
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

	/*public int ultimaNota() {
		// TODO Auto-generated method stub
		return 0;
	}*/

	public boolean aproboUltima() {
		// TODO Auto-generated method stub
		return true;
	}

}

