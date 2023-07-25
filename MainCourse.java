package restro;
import java.util.*;

public class MainCourse {
	//	public int quantity;
	public int choice;
//	public static int total;
	Scanner sc = new Scanner(System.in);
	
	
	public void mainCourseDisplay() {
		FoodOrder fo =new FoodOrder();
		
		System.out.println("**********Main Course**********");
		System.out.println("=====================================\n");
		System.out.println("1.Chicken Handi\t\t\t450/-");
		System.out.println("2.Thai Plate\t\t\t580/-");
		System.out.println("3.Tripple Rice \t\t\t370/-");
		System.out.println("4.Veg Pasta\t\t\t350/-");
		System.out.println("=====================================");
		System.out.println("Choose your option: ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("You have choosen Chiken Handi");
			
			System.out.println("Enter your desired quantity: ");
			fo.quantity =sc.nextInt();
			fo.orderedItems += "\nChiken handi            450/-";
			fo.total += 450 * fo.quantity;
			break;
			
		case 2:
			System.out.println("You have chosen Thai Plate");
			
			System.out.println("Enter your desired quantity: ");
			fo.quantity =sc.nextInt();
			fo.orderedItems += "\nThai plate            580/-";
			fo.total += 580 * fo.quantity;
			break;
			
		case 3:
			System.out.println("You have choosen Tripple Rice ");
			
			System.out.println("Enter your desired quantity: ");
			fo.quantity =sc.nextInt();
			fo.orderedItems += "\nTripple Rice            370/-";
			fo.total += 370 * fo.quantity;
			
			break;
			
		case 4:
			System.out.println("You have choosen Veg pasta");
			
			System.out.println("Enter your desired quantity: ");
			fo.quantity =sc.nextInt();
			fo.orderedItems += "\nVeg pasta            350/-";
			fo.total += 350 * fo.quantity;
			
			break;
		default:
			System.out.println("---Invalid input------");
			mainCourseDisplay();
			break;
		}
		
//		System.out.println("bill is"+fo.total);
	}
	public static void main(String args[]) {
		MainCourse mc = new MainCourse();
		
		mc.mainCourseDisplay();
	}

}
