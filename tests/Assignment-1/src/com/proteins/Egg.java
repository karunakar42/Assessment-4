package com.proteins;

public class Egg extends Food{
	int tastyScore=7; 
	String type="non-vegetarian";	
	public Egg(double proteins, double fats, double carbs, double tastyScore) {
		super();
		this.proteins = proteins;
		this.fats = fats;
		this.carbs = carbs;
		this.tastyScore = (int) tastyScore;
	}


	@Override
	void getMacroNutrients() {
		System.out.println("An egg has "
				+this.proteins+"gms of protein,"
				+this.fats+"gms of fats and "
				+this.carbs+"gms of carbohydrates.");
	}

}
