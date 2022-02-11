package Exeptions;

public class NegativeNumberException extends Exception{
	
	public NegativeNumberException(double add) {
		super("Not possible to add negative weight: " + add);
	}
}
