package domain;

import java.time.LocalDate;

public class Calificacion {

    private Integer id;
    private Integer value;
    private LocalDate created_at;
    private LocalDate updated_at;

    public Calificacion(Integer id, Integer value, LocalDate createdAt, LocalDate updatedAt) {
        this.id = id;
        this.value = value;
        this.created_at = createdAt;
        this.updated_at = updatedAt;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public LocalDate getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDate created_at) {
		this.created_at = created_at;
	}

	public LocalDate getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalDate updated_at) {
		this.updated_at = updated_at;
	}
    
}




