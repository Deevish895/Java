package restro;

import java.util.*;

public class FoodOrder {
	static int choice;
    public static int total;
	public  int quantity;
	static String again;
	public static String orderedItems = "";
	
	static Scanner sc = new Scanner(System.in);
	
	
	public void generateBill() {
		System.out.println("\n*****Thanks for ordering*****");
		System.out.println("======You have ordered========\n"+orderedItems);
		System.out.println("\nYour Total bill is:----- \t"+total+"/-");
	}
	
	
	public static void main(String[] args) {
		Menu menu = new Menu();
		System.out.println("\n*****Welcome to Sunshine Hotel*****");
		System.out.println("=====================================");
		menu.menuDisplay();
	
	}

}
