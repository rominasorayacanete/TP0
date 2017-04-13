package domain;

import org.uqbar.commons.model.UserException;

public class NoTieneNotasException extends UserException {
	
	public NoTieneNotasException(String message) {
		super(message);
	}
	
}
