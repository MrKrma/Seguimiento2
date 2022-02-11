package Exeptions;

public class RemoveNegativeNumberException extends Exception {
	
	public RemoveNegativeNumberException(double remove) {
		super("Not possible to remove negative weight: " + remove);
	}

}
