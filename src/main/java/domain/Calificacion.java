package domain;

import org.apache.commons.lang.StringUtils;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
//import org.joda.time.String;
import org.joda.time.format.DateTimeFormatter;

//import launcher.LocalDateTime;
//import launcher.DateTimeFormatter;

public class Calificacion {
    private Integer id;
    private String value;
    private String created_at;
    private String updated_at;
    /*
    
    */
    public Calificacion(Integer id, String value, String createdAt, String updatedAt) {

        this.id = id;
        this.value = value;
        this.created_at = createdAt;
        this.updated_at = updatedAt;
        
    }
    

    private LocalDateTime transformarAFecha(String fecha) {
        String pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
        DateTimeFormatter dtf = DateTimeFormat.forPattern(pattern);
        
        return  dtf.parseLocalDateTime(fecha);		
	}


	public boolean estaAprobada() {
    	if( StringUtils.isNumeric(value) ) {
    		Integer nota = Integer.parseInt(value);
    		
    		return nota > 4;
    	}
    	return value.toUpperCase().charAt(0) == 'B';
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

	public LocalDateTime getCreated_at() {
		return this.transformarAFecha(created_at);
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}


	public LocalDateTime getUpdated_at() {
		return this.transformarAFecha(updated_at);
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

}