package com.proteins;

public class Bread extends Food{
	int tastyScore=8; 
	String type="vegetarian";	
	Bread(double proteins, double fats, double carbs, double tastyScore) {
		super();
		this.proteins = proteins;
		this.fats = fats;
		this.carbs = carbs;
		this.tastyScore = (int) tastyScore;
	}

	@Override
	void getMacroNutrients() {
		System.out.println("A slice of bread has "+this.proteins+"gms of proteins,"
				+this.fats+"gms of fats and "+this.carbs+"gms of carbohydrates.");
	}

}
