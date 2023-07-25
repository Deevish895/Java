package restro;
import java.util.*;


public class Beverages {
//	public int quantity;
	public int choice;
//	public static int total;
	Scanner sc = new Scanner(System.in);
	
	public void beveragesDisplay() {
		FoodOrder fo =new FoodOrder();
		System.out.println("**********Beverages**********");
		System.out.println("=====================================");
		System.out.println("1.Guava Chilly\t\t\t250/-");
		System.out.println("2.Mojito\t\t\t380/-");
		System.out.println("3.Royal Martini \t\t\t270/-");
		System.out.println("4.Manhattan Whiskey\t\t\t250/-");
		System.out.println("=====================================");
		System.out.println("Choose your option: ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("You have choosen Guava Chilly");
			
			System.out.println("Enter your desired quantity: ");
			fo.quantity =sc.nextInt();
			fo.orderedItems += "\nGuava Chilly        250/-";
			fo.total += 250 * fo.quantity;
			break;
			
		case 2:
			System.out.println("You have chosen Mojito");
			
			System.out.println("Enter your desired quantity: ");
			fo.quantity =sc.nextInt();
			fo.orderedItems += "\nMojito         380/-";
			fo.total += 380 * fo.quantity;
			break;
			
		case 3:
			System.out.println("You have choosen Royal martini");
			
			System.out.println("Enter your desired quantity: ");
			fo.quantity =sc.nextInt();
			fo.orderedItems += "\nRoyal Martini            270/-";
			fo.total += 270 * fo.quantity;
			
			break;
			
		case 4:
			System.out.println("You have choosen Royal Martini");
			
			System.out.println("Enter your Quantity: ");
			fo.quantity =sc.nextInt();
			
			fo.total += 250 * fo.quantity;
			
			break;
			
		default:
			
			System.out.println("---Invalid input------");
			beveragesDisplay();
		}
		
	}
}
