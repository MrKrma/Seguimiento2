package model;

import Exeptions.NegativeNumberException;
import Exeptions.RemoveNegativeNumberException;

public class Ingredient {
	private String name;
	private double weight;
	
	public Ingredient(String n, double w) {
		name = n;
		weight = w;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void addWeight(double additionalW) throws NegativeNumberException {
		if(additionalW <= 0) {
			throw new NegativeNumberException(additionalW);
		}else {
			weight = weight + additionalW;
		}
	}
	
	public void removeWeigth(double toRemoveW) throws RemoveNegativeNumberException {
		if(toRemoveW <= 0) {
			throw new RemoveNegativeNumberException(toRemoveW);
		}else {
			weight = weight - toRemoveW;
		}
		
	}
	
}
