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
	
	private void setupStage2() {
		receta = new Recipe();
		receta.addIngredient("cebolla", 315);
		receta.addIngredient("ajo", 58);
		receta.addIngredient("arroz", 520);
	}
	
	//test
	@Test
	void addANewIngredient() {
		setupStage1();
		String name = "sal";
		double weight = 12;
		receta.addIngredient(name, weight);
		
		Ingredient ingredient = receta.getIngredients().get(0);
		assertEquals(name, ingredient.getName());
		assertEquals(weight, ingredient.getWeight());
	}
	
	@Test
	void addNewIngredient() {
		setupStage2();
		String name = "pimienta";
		double weight = 6;
		receta.addIngredient(name, weight);
		
		Ingredient ingrediente = receta.getIngredients().get(receta.getIngredients().size()-1);
		assertEquals(4, receta.getIngredients().size());
		assertEquals(name, ingrediente.getName());
		assertEquals(weight, ingrediente.getWeight());
		
	}
	
	@Test
	void addWeigth() {
		setupStage2();
		String name = "ajo";
		double weight = 21;
		receta.addIngredient(name, weight);
		
		Ingredient ingrediente = receta.getIngredients().get(1);
		assertEquals(3, receta.getIngredients().size());
		assertEquals(name, ingrediente.getName());
		assertEquals(79, ingrediente.getWeight());
		
	}
	
	@Test
	void removeIngredient() {
		setupStage2();
		String name = "ajo";
		
		receta.removeIngredient(name);
		assertEquals(2, receta.getIngredients().size());	
	}

}
