package com.aplicacao.cursomc.services.exception;

public class ObjectNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		// Throable seria a causa de algo q já aconteceu antes
		super(msg, cause);
	}


}
