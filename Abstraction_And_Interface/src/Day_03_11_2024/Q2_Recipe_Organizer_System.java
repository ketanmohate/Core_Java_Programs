package Day_03_11_2024;

import java.util.*;

interface Recipe
{
	
	void prepare();
	void getIngredients();
}
 
abstract class BaceRecipe implements Recipe
{
	public void prepare()
	{
		
	}
	public void getIngredients()
	{
		System.out.println("");
	}
	
}

class VegetableRecipe extends BaceRecipe
{
	String prepare;
	String ingredient;
	VegetableRecipe(String prepare, String ingredient)
	{
		this.prepare = prepare;
		this.ingredient = ingredient;
	}
	public void prepare()
	{
		System.out.println("Preparing a:" +prepare);
	}
	public void getIngredients()
	{
		System.out.println("Ingredients: " + ingredient);
	}
	
}

class DessertRecipe extends BaceRecipe
{
	String prepare;
	String ingredient;
	DessertRecipe(String prepare, String ingredient)
	{
		this.prepare = prepare;
		this.ingredient = ingredient;
	}
	public void prepare()
	{
		System.out.println("Preparing a:" +prepare);
	}
	
	public void getIngredients()
	{
		System.out.println("Ingredients: " + ingredient);
	}
	
}

public class Q2_Recipe_Organizer_System 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Recipe[] r = new Recipe[1];
		
		for(int i=0 ; i<r.length ; i++)
		{
			System.out.println("Enter the Preparing :");
			String vp = sc.nextLine();
			
			System.out.println("Enter the Ingredients");
			String vi = sc.nextLine();
			
			System.out.println("Enter the Preparing:");
			String dp = sc.nextLine();
			
			System.out.println("Enter the Ingredients");
			String di = sc.nextLine();
			
			r[i] = new VegetableRecipe(vp, vi);
			r[i] = new DessertRecipe(dp, di);
		}
		
		for(Recipe recipe : r)
		{
			recipe.prepare();
			recipe.getIngredients();
		}
	}

}
