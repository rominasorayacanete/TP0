package domain;

import java.util.List;

public class Materia {

    private Integer id;
    private String title;
    private String description;
    private List<Calificacion> grado;

    public Materia() {
    }

    public Materia(Integer id, String title, String description, List<Calificacion> grado) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.grado = grado;
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

    public List<Calificacion> getGrado() {
        return grado;
    }

    public void setGrades(List<Calificacion> grado) {
        this.grado = grado;
    }

}