package db;
//Custom exception of referential integrity.

//Exce��o personalizada de integridade refer�ncial 

public class DbIntegrityException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DbIntegrityException(String msg) {
		super(msg);

	}
}
