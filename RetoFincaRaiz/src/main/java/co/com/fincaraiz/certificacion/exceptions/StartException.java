package co.com.fincaraiz.certificacion.exceptions;

public class StartException extends AssertionError  {

	private static final long serialVersionUID = 1L;
	public static final String MESSAGE_PAGE_NOT_LOADED = "The page could not be loaded";
    public static final String MESSAGE_FAILED_AUTHENTICATION = "Authentication failed";
    public static final String MESSAGE_DEPARTMENT_NOT_EXIST = "The department does not exist in the map";
    public static final String MESSAGE_CITY_NOT_EXIST = "The city does not exist in the map";
    public static final String PROPERTY_NOT_EXIST = "Does not exist properties";

    public StartException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public StartException(String message) {
        super(message);
    }
}