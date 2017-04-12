package domain;


import java.util.List;

public class HistorialAcademico {

    private List<Materia> assignments;

    public HistorialAcademico() {
    }

    public HistorialAcademico(List<Materia> assignments) {
        this.assignments = assignments;
    }

    public List<Materia> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Materia> assignments) {
        this.assignments = assignments;
    }

}
