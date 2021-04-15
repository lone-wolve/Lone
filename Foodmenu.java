package restaurantMenu;

import java.util.Scanner;

public class Foodmenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 Display a header with a welcome
		
		System.out.println( "\n"+"  "+"Welcome to Our Restaurant" + "\n"+ "\n"+ "\t" + "   " + "Food Menu"+ "\n"+ 
		"--------------------------------------------------------" );
//		Create a container to store name of each category
		String Category_1 = "Drink";
		String Category_2 = "Meal";
		String Category_3 = "Desert";

//		Display a header of the category with its prices
		System.out.println( " "+  Category_1 + "\t price\t" +"    "+ Category_2+"     "+" price\t" + Category_3 + "\t price\n" + 
		"--------------------------------------------------------" );
//		Create a container to store multiple items of each category and prices
	    String[] Category_1_item = { "boaba", "wonjo", "Dahar"};
		double[] Category_1_prices = { 20,       10,     30   };
		
		String[] Category_2_item = { "plasas", "acheke", "domoda"};
		double[] Category_2_prices = { 60,       70,       80 };
		
		String[] Category_3_item = { "chakri", " cake ",   "juice " };
	double[] Category_3_prices   = {  50,       60,        50    };

//	use a loop to loop through each category items and prices for it to be displayed in an organised manner
         for (int i = 0; i<3; i++  ) {
		
		System.out.println( i+1 +" "+Category_1_item [i] + "   " +  Category_1_prices [i]+ "  "
				+ (i+1)+"  "+Category_2_item [i] + "     " +  Category_2_prices [i] + "     "
				+ (i+1)+" "+Category_3_item [i] + "  " +  Category_3_prices [i] + "  ");
				
		
       }
//		      invoke each method in the main
        Drink();
        Meal();
        Desert();
        Receipt();
						
	}
//	create a variable that can be accessed by each method
	    static String choice_1 = "",choice_2 = "",choice_3 = "";
		static double price_of_choice_1 = 0,price_of_choice_2 = 0,price_of_choice_3 = 0;
		
		static double sum = 0;
//		create a method for drink
	  public static void Drink() {
		  
//		  get user input for drinks
		  Scanner input= new Scanner(System.in);
		  System.out.println( "select an item from drinks");
			int item1 = input.nextInt();
//		create a container to store items and price for drinks
			String[] category_1_items = { "boaba", "wonjo", "Dahar"};
			double[] category_1_prices = { 20,       10,     30   };
//		use the if condition to verify the user choice of item selected
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
			
			sum = sum( sum , price_of_choice_1 );
	  }
	
      public static void Meal() {
    	  	  
    	  String[] category_2_items = { "plasas", "acheke", "domoda"};
  		  double[] category_2_prices = { 60,       70,       80 };
		 
    	  Scanner input= new Scanner(System.in);
		  System.out.println( "select an item from Meal");
			int item1 = input.nextInt();
			
			if(item1 == 1)
			{
				 choice_2 = category_2_items[0];
				 price_of_choice_2 = category_2_prices[0];			 
			}
			else if(item1 == 2)
			{
				 choice_2 = category_2_items[1];
				 price_of_choice_2 = category_2_prices[1];			 
			} 
			else if(item1 == 3)
			{
				 choice_2 = category_2_items[2];
				 price_of_choice_2 = category_2_prices[2];			 
			}else
			{
				 choice_2 = "None";
				 price_of_choice_2 = 0;			 
			}
			
			sum = sum ( sum , price_of_choice_2 );
				
	    }

     public static void Desert() {
	
    	 String[] category_3_items = { "chakri", " cake ",   "juice " };
    		double[] category_3_prices   = {  50,       60,        50    };

    		
    		 Scanner input= new Scanner(System.in);
    		 
   		  System.out.println( "select an item from Desert");
   			int item1 = input.nextInt();
   			
   			if(item1 == 1)
   			{
   				 choice_3 = category_3_items[0];
   				 price_of_choice_3 = category_3_prices[0];			 
   			}
   			else if(item1 == 2)
   			{
   				 choice_3 = category_3_items[1];
   				 price_of_choice_3 = category_3_prices[1];			 
   			} 
   			else if(item1 == 3)
   			{
   				 choice_3 = category_3_items[2];
   				 price_of_choice_3 = category_3_prices[2];			 
   			}else
   			{
   				 choice_3 = "None";
   				 price_of_choice_3 = 0;			 
   			}
   			
   		sum = sum ( sum , price_of_choice_3 );   			
	
      }
     
     public static double sum(double a, double b) 
     {
		return a+b;
    	 
     }
    
     public static void Receipt() {
// 		print out the header of category, item and prices
 		System.out.println(".................................."
 						+ "\ncategory"+"\t item "+"\tPrice"
 						+ "\n.................................");
 		
// 	Print receipt of selected items, their prices and total 
 		System.out.println( "Drink" + "\t" +  "\t"+choice_1 + "\t" + price_of_choice_1 + "\n"
 						+ "Meal" + "\t" +  "\t"+choice_2 + "\t" + price_of_choice_2 + "\n" +
 						"Desert" + "\t" +  "\t"+choice_3 + "\t" + price_of_choice_3 + "\n"
 						+ ".................................."+
 						"\nTotal price is " + "\t" + "\t" +sum
 						+ "\n.................................."
 				                                                );
 		

     }
}
