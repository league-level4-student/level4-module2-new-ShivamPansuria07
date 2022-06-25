package _02_Generics_Store;

import java.util.ArrayList;

import _01_Generics_Vs_Object.ObjectsList;

public class GoShopping {
	// 1. Look through other classes to see how they all interact.
	//
	//    There is a generic Cart class that can hold different 
	//    types of objects.
	//
	//    Candy and Cereal are Food objects
	//    Clothing and Toy are NonFood objects.
	
	public static void main(String[] args) {
		// 2. Create a Cart object of type Candy
//		Cart<Candy> candy = new Cart<Candy>();
		
       
		// 3. Create another Cart object of type Cereal
//	Cart<Cereal> cereal = new Cart<Cereal>();
		
		// 4. Add a few items to EACH cart
		
//		candy.add(new Candy());
//		cereal.add(new Cereal());
		
		// 5. Call the showCart() method on EACH cart
//		candy.showCart();
//		cereal.showCart();
		// 6. Run the code
		
		// 7. Comment out the code you have so far
		
		// 8. Repeat steps 2-5 for a Clothing Cart and a Toy Cart
		Cart<Clothing> clothing = new Cart<Clothing>();
		Cart<Toy> toy = new Cart<Toy>();
		clothing.add(new Clothing());
		toy.add(new Toy());
		clothing.showCart();
		toy.showCart();
		// Why are there errors?
		
		// 9. Modify the Cart class so that this code compiles
		// HINT: There are 3 lines of code to edit
				
		 /*
	     * Write a program that simulates shopping in a store using the Scanner and
	     * the classes in Generics_Store.
	     * 
	     * Note: You may need to modify existing code in Generics Store and/or add
	     * additional items and pictures to fulfill all the requirements. You are
	     * also free to add any additional methods or classes in Console Store that
	     * might be helpful to you.
	     * 
	     * Requirements:
	     * 
	     * -Use Ternary operators in place of simple if/else statements(DONE) and do-while
	     * loops instead of while loops where appropriate.
	     * 
	     * - There should be at least four unique items the user can buy. These can
	     * be food items, nonfood items or both.
	     * 
	     * - The user should have a stipend of money to spend and each item should
	     * have its own price.
	     * 
	     * -The user should have the ability to add items to their cart, remove
	     * items, view items or check out.
	     * 
	     * -The program should continue until the user chooses to check out.
	     * 
	     * -When the user checks out you should let them know if they do not have
	     * enough money to purchase all their items and offer to put items back.
	     * 
	     * -If the user successfully purchases the items you should remove the
	     * amount from their stipend, show them the pictures of what they bought and
	     * print out a receipt showing their name, the individual prices of the
	     * items and their total.
	     */
		
	}
}
