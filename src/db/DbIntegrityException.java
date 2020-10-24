package db;
//Custom exception of referential integrity.

//Exceção personalizada de integridade referêncial 

public class DbIntegrityException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DbIntegrityException(String msg) {
		super(msg);

	}
}
