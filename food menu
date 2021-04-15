package Foodmenu;

import java.util.Scanner;

public class Food {
	

	public static void main(String[] args) 
	{		
		
//		declare strings for each category
		String category_1 = "Food";
		String category_2 = "Drink";
		String category_3 = "Dinner";
		
//		create an Array of of each strings of food, drink, dinner
		String[] category_1_items = {"Bread","Egg","Cake"};
		double[] category_1_prices = {	12,	  10 ,	15	};
		
		String[] category_2_items = {"soda","Water","Juice"};
		double[] category_2_prices = {	35,	  40 ,	25	};

		String[] category_3_items = {"Domoda","Jollof","Mbahal"};
		double[] category_3_prices = {	30,	  40 ,	50	};
		 
//		print out the category headers
		System.out.println("  "+category_1+"\tPrice\t"+category_2+"\tPrice\t"+category_3+"\tPrice\n");

//		loop through the array of category items and prices to show each category with its items and price
		for(int i = 0; i < 3 ; i++)
		{
			System.out.println( i+1 +" "+ category_1_items [i] + "\t" + category_1_prices [i] + "\t" 
								+ (i+1) +" "+ category_2_items [i] + "\t" + category_2_prices [i] + "\t"
					+ (i+1) +" "+category_3_items [i] + "\t" + category_3_prices [i]);
		}		
		
//		Scanner class use to enter the input of each selected item (category1)
		Scanner input= new Scanner(System.in);		
		
		System.out.println( "select an item from food");
		int item1 = input.nextInt();
		
// Declare variables to hold the related item and it's price to the user input 
		String choice_1 = "";
		double price_of_choice_1 = 0;
		
		double sum = 0;

// Verify user choice of item within category 1
		if(item1 == 1)
		{
			 choice_1 = category_1_items[0];
			 price_of_choice_1 = category_1_prices[0];			 
		}
		else if(item1 == 2)
		{
			 choice_1 = category_1_items[1];
			 price_of_choice_1 = category_1_prices[1];			 
		} 
		else if(item1 == 3)
		{
			 choice_1 = category_1_items[2];
			 price_of_choice_1 = category_1_prices[2];			 
		}else
		{
			 choice_1 = "None";
			 price_of_choice_1 = 0;			 
		}
		
		
		

//		Scanner class use to enter the input of each selected item (category1)

		System.out.println( "select an item from drinks");
		int item2 = input.nextInt();
		
//		Declare variables to hold the related item and it's price to the user input 
		String choice_2 = "";
		double price_of_choice_2 = 0;
		// Verify user choice of item within category 2
		if(item2 == 1)
		{
			 choice_2 = category_2_items[0];
			 price_of_choice_2 = category_2_prices[0];			 
		}
		else if(item2 == 2)
		{
			 choice_2 = category_2_items[1];
			 price_of_choice_2 = category_2_prices[1];			 
		} 
		else if(item2 == 3)
		{
			 choice_2 = category_2_items[2];
			 price_of_choice_2 = category_2_prices[2];			 
		}else
		{
			 choice_2 = "None";
			 price_of_choice_2 = 0;			 
		}
		
			
//		Scanner class use to enter the input of each selected item (category1)
		System.out.println( "select an item from dinner");
		int item3 = input.nextInt();
//		Declare variables to hold the related item and it's price to the user input
		String choice_3 = "";
		double price_of_choice_3 = 0;
		
		//double sum = 0;
		// Verify user choice of item within category 3
		if(item3 == 1)
		{
			 choice_3 = category_3_items[0];
			 price_of_choice_3 = category_3_prices[0];			 
		}
		else if(item3 == 2)
		{
			 choice_3 = category_3_items[1];
			 price_of_choice_3 = category_3_prices[1];			 
		} 
		else if(item3 == 3)
		{
			 choice_3 = category_3_items[2];
			 price_of_choice_3 = category_3_prices[2];			 
		}else
		{
			 choice_3 = "None";
			 price_of_choice_3 = 0;			 
		}
		
//		add the sum of all selected item and string to print out
		sum= sum + price_of_choice_1 + price_of_choice_2 + price_of_choice_3;
		
//		print out the header of category, item and prices
		System.out.println(".................................."
						+ "\ncategory"+"\t item "+"\tPrice"
						+ "\n.................................");
		
//	Print receipt of selected items, their prices and total 
		System.out.println( category_1 + "\t" +  "\t"+choice_1 + "\t" + price_of_choice_1 + "\n"
						+ category_2 + "\t" +  "\t"+choice_2 + "\t" + price_of_choice_2 + "\n" +
						category_3 + "\t" +  "\t"+choice_3 + "\t" + price_of_choice_3 + "\n"
						+ ".................................."+
						"\nTotal price is " + "\t" + "\t" +sum
						+ "\n.................................."
				                                                );
		

	
	}
	
	

}

