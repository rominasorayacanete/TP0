package domain;


import java.util.List;

public class Nota {

    private List<Materia> assignments;

    public Nota() {
    }

    public Nota(List<Materia> assignments) {
        this.assignments = assignments;
    }

    public List<Materia> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Materia> assignments) {
        this.assignments = assignments;
    }

}
