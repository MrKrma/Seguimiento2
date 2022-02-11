package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecipeTest {
	
	//stage
	private Recipe receta;
	
	//cases
	private void setupStage1() {
		receta = new Recipe();
	}
	
	//test
	@Test
	void addANewIngredient() {
		setupStage1();
		String name = "sal";
		double weight = 12;
		receta.addIngredient(name, weight);
	}

}
