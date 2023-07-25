package restro;
import java.util.*;
public class Starter {
	
	
	

	public int choice;
	Scanner sc = new Scanner(System.in);
	
	
	public void starterDisplay() {
		FoodOrder fo =new FoodOrder();
		
		System.out.println("**********Starters**********");
		System.out.println("=====================================\n");
		System.out.println("1.Spring roll\t\t\t150/-");
		System.out.println("2.Chilly Paneer\t\t\t180/-");
		System.out.println("3.Mushroom 65\t\t\t170/-");
		System.out.println("4.Crispy Veg\t\t\t150/-");
		System.out.println("=====================================");
		System.out.println("\nChoose your option: ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("\nYou have choosen Spring Roll");
			
			System.out.println("\nEnter your desired quantity: ");
			fo.quantity =sc.nextInt();
			fo.orderedItems += "\nSpring roll            150/-";
			fo.total += 150 * fo.quantity;
			break;
			
		case 2:
			System.out.println("\nYou have chosen Chilly Paneer");
			
			System.out.println("\nEnter your desired quantity: ");
			fo.quantity =sc.nextInt();
			fo.orderedItems += "\nChilly Paneer            180/-";
			fo.total += 180 * fo.quantity;
			break;
			
		case 3:
			System.out.println("You have choosen Mushroom 65");
			
			System.out.println("Enter your desired quantity: ");
			fo.quantity =sc.nextInt();
			fo.orderedItems += "\nMushroom 65            170/-";
			fo.total += 170 * fo.quantity;
			
			break;
			
		case 4:
			System.out.println("You have choosen Crispy veg");
			
			System.out.println("Enter your desired quantity: ");
			fo.quantity =sc.nextInt();
			fo.orderedItems += "\nCrispy Veg            150/-";
			fo.total += 150 * fo.quantity;
			
			break;
		default:
			System.out.println("---Invalid input------");
			starterDisplay();
			break;
		}
		
//		System.out.println("bill is"+fo.total);
		
		
	}
	public static void main(String args[]) {
		Starter st = new Starter();
		
		st.starterDisplay();
		
		
	}

}
