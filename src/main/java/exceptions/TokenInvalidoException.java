package exceptions;

import org.uqbar.commons.model.UserException;

public class TokenInvalidoException extends UserException {
	
	public TokenInvalidoException(String message) {
		super(message);
	}
	
}