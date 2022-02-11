/**
 * 
 */
package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exeptions.NegativeNumberException;
import Exeptions.RemoveNegativeNumberException;

/**
 * @author juanp
 *
 */
class IngredientTest {
	
	//Stage
	private Ingredient ingrediente;
	
	//cases
	public void setupStage1() {
		ingrediente = new Ingredient("Tomante", 245);
	}

	//Test
	@Test
	void addWeigthTest() {
		setupStage1();
		try {
			ingrediente.addWeight(54);
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
		assertEquals(299, ingrediente.getWeight());
		
	}
	
	@Test
	void addNegativeWeigthTest() {
		setupStage1();
		
		double weigth = -100;
		try {
			ingrediente.addWeight(weigth);
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
		assertEquals(245, ingrediente.getWeight());
	}
	
	@Test
	void toRemoveWeigth() {
		setupStage1();
		try {
			ingrediente.removeWeigth(45);
		} catch (RemoveNegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(200, ingrediente.getWeight());
	}
	
	@Test
	void toRemoveNegativeWeight() {
		setupStage1();
		
		double weight = -100;
		try {
			ingrediente.removeWeigth(weight);
		} catch (RemoveNegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(245, ingrediente.getWeight());
	}

}
