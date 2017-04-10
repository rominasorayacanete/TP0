package domain;

import java.util.Date;

public class Calificacion {

    private Integer id;
    private String value;
    private Date created_at;
    private Date updated_at;
    

    public Calificacion(Integer id, String value, Date createdAt, Date updatedAt) {
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date createdAt) {
        this.created_at = createdAt;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updatedAt) {
        this.updated_at = updatedAt;
    }

}
