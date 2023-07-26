package restro;
import java.util.*;

public class Menu {
//	static int total;
	int choice;
	String again;
	Scanner sc= new Scanner(System.in);
	public void menuDisplay() {        
		//Object creation for classes
		Starter str =new Starter();        
		MainCourse mc = new MainCourse();
		Dessert dc = new Dessert();
		Beverages bv = new Beverages();
		FoodOrder fo =new FoodOrder();
	
	              //print main menu 
		System.out.println("=====================================");
		System.out.println("1.Starter");
		System.out.println("2.Main Course");
		System.out.println("3.Desserts");
		System.out.println("4.Drinks");
		System.out.println("5.Exit");
		System.out.println("=====================================");
		System.out.println("What do you want to order today??");
		
                 // For to loop to run continuously

		while(true) {
			
		
		
		System.out.println("Choose your option: ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:       // For starter
			System.out.println("You have choosen Starter");
			do {
				str.starterDisplay();
//				total = total + fo.total;
				System.out.println("\nDo you want to add another item(Y/N)");
				again = sc.next();
				
			}while(again.equalsIgnoreCase("Y"));     //equalsIgnoreCase  for ignoring the uppercase and lowercase
			
			
			
			break;
			
		case 2:    // For Main course dishes
			System.out.println("You have chosen Main Course");
			do {
				mc.mainCourseDisplay();
//				total = total + fo.total;
				System.out.println("\nDo you want to add another item(Y/N)");
				again = sc.next();
				
			}while(again.equalsIgnoreCase("Y"));
			
			
			break;
			
		case 3:          // For Dessert foods
			System.out.println("You have choosen ");
			do {
				dc.dessertDisplay();
//				total = total + fo.total;
				System.out.println("\nDo you want to add another item(Y/N)");
				again = sc.next();
				
			}while(again.equalsIgnoreCase("Y"));
			
			
			
			break;
			
		case 4:      // for the Beverages
			System.out.println("\nYou have choosen Drinks");
			do {
				bv.beveragesDisplay();
//				total = total + fo.total;
				System.out.println("\nDo you want to add another item(Y/N)");
				again = sc.next();
				
			}while(again.equalsIgnoreCase("Y"));
			
		
			
			break;
		case 5:         // To exit the program
			System.exit(1);
			break;
		default:
			System.out.println("---Invalid input------");
			menuDisplay();
		}

// switch case end
		System.out.print("Do you want to order anything else(y/n): ");
		again = sc.next();
		if(again.equalsIgnoreCase("Y")) {
			menuDisplay();
		}else if(again.equalsIgnoreCase("N")){
			fo.generateBill();
			System.exit(1);
		}else {
			System.out.println("Invalid Choice");
			menuDisplay();
		}
		}
	}
	
	public static void main(String args[]) {
		Menu mn =new Menu();
		
		mn.menuDisplay();
//		System.out.println(+total);
	}

}
