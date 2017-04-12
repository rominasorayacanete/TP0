package domain;

import java.time.LocalDate;

public class Calificacion {

    private Integer id;
<<<<<<< HEAD
    private String value;
    private LocalDate created_at;
    private LocalDate updated_at;

    public Calificacion(Integer id, String value, LocalDate createdAt, LocalDate updatedAt) {
=======
    private Integer value;
    private LocalDate created_at;
    private LocalDate updated_at;

    public Calificacion(Integer id, Integer value, LocalDate createdAt, LocalDate updatedAt) {
>>>>>>> ba666c310b6cf0af639aa40f36523b29bf96acc8
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

<<<<<<< HEAD
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public LocalDate getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDate created_at) {
		this.created_at = created_at;
	}

=======
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

>>>>>>> ba666c310b6cf0af639aa40f36523b29bf96acc8
	public LocalDate getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalDate updated_at) {
		this.updated_at = updated_at;
	}
<<<<<<< HEAD
    
=======
>>>>>>> ba666c310b6cf0af639aa40f36523b29bf96acc8
}

