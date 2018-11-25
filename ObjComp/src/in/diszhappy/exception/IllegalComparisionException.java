/**
 * 
 */
package in.diszhappy.exception;

/**
 * @author Saumm created on 24-Nov-2018 9:34:56 AM 
 * Desc : This class is created to define Illegal Comparision Exception
 */
public class IllegalComparisionException extends RuntimeException {

	private static final long serialVersionUID = 27706688818341265L;

	public IllegalComparisionException() {
		super();
	}

	public IllegalComparisionException(String message) {
		super(message);
	}
}
