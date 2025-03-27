package com.java;

/*
 *Q2. Recipe Organizer System 
Objective: Create a system for managing different types of recipes. 
Requirements: 
Define an Interface: 
Create an interface named Recipe with methods prepare() and getIngredients(). 
Define an Abstract Class: 
Create an abstract class named BaseRecipe that implements Recipe. 
Provide a concrete implementation of getIngredients() to display a generic list of 
ingredients. 
Leave prepare() abstract. 
Implementing Classes: 
Create a class VegetableRecipe that extends BaseRecipe and implements prepare() to 
provide instructions for preparing a vegetable dish. 
Create a class DessertRecipe that extends BaseRecipe and implements prepare() to 
provide instructions for preparing a dessert. 
Demonstration: 
Create an array of Recipe objects. 
Initialize it with instances of VegetableRecipe and DessertRecipe. 
Call prepare() and getIngredients() for each recipe to demonstrate functionality. 
Expected Output: 
Preparing a delicious vegetable stir-fry. 
Ingredients: vegetables, oil, spices. 
Preparing a rich chocolate cake. 
Ingredients: flour, sugar, cocoa powder, eggs.
 */

import java.util.*;

interface Recipe
{
	void prepare();
	void getIngredients();
}

abstract class BaseRecipe implements Recipe
{
	public void prepare() 
	{
		
	}
	public void getIngredients()
	{
		
	}
}
class VegetableRecipe extends BaseRecipe 
{
	private String VPrepare;
	private String Vingredents;
	public VegetableRecipe(String  VPrepare, String Vingredents ) {
		this.VPrepare = VPrepare;
		this.Vingredents = Vingredents;
	}
	public void prepare() 
	{
		System.out.println("Preparing a delicious vegetable : "+VPrepare);
		
	}
	
	public void getIngredients()
	{
		System.out.println("Ingredents: "+Vingredents);
	}

}
class DessertRecipe extends BaseRecipe 
{
	private String DPrepare;
	private String Dingredents;
	public DessertRecipe(String  DPrepare, String Dingredents ) {
		this.DPrepare = DPrepare;
		this.Dingredents = Dingredents;
	}
	public void prepare() 
	{
		System.out.println("Preparing a delicious Dessert : "+DPrepare);
		
	}
	
	public void getIngredients()
	{
		System.out.println("Ingredents: "+Dingredents);
	}

}

public class Q4_ 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Recipe [] recipe = new Recipe[2];
		
		for(int i = 0 ; i < recipe.length;i++) {
			System.out.println("Enter the Vegetable Prepare: ");
			String Vprepare = sc.nextLine();
			
			System.out.println("Enter the Vegetable ingredents");
			String Vingredents = sc.nextLine();
			
			System.out.println("Enter the Vegetable Prepare: ");
			String Dprepare = sc.nextLine();
			
			System.out.println("Enter the Vegetable ingredents");
			String Dingredents = sc.nextLine();
			
			recipe[i] = new VegetableRecipe(Vprepare , Vingredents);
			recipe[i] = new DessertRecipe(Dprepare, Dingredents);
			
		 }
		for(Recipe r : recipe)
		{
			r.prepare();
			r.getIngredients();
		}
	}

}
