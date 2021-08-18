package common.util;

public interface AppConstants {

	public static final int HTTP_OK = 200;
	public static final int HTTP_ERROR = 500;

	public static final String HTTP_JSON_CONTENT = "application/json";
	
	
	public static final StringBuilder selectTicekt = new StringBuilder("SELECT * FROM reim.tickets");
	public static final StringBuilder insert = new StringBuilder("INSERT INTO reim.tickets");
	public static final StringBuilder selectJoin = new StringBuilder("select * from reim.user natural join "
																	+ "reim.tickets");
}
