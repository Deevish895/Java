package restro;

import java.util.Scanner;

public class Dessert {
	
	

	public int choice;
//	public static int total;
	Scanner sc = new Scanner(System.in);
	
	
//	int stotal = Starter.total;
	public void dessertDisplay() {
		FoodOrder fo =new FoodOrder();
		System.out.println("**********Desserts**********");
		System.out.println("=====================================\n");
		System.out.println("1.Dry Fruit Barfi\t\t\t250/-");
		System.out.println("2.Gulab Jamun\t\t\t280/-");
		System.out.println("3.Ras Malai \t\t\t270/-");
		System.out.println("4.Blue Berry Ice-cream.\t\t\t250/-");
		System.out.println("=====================================");
		System.out.println("Choose your option: ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("You have choosen Dry Fruit Barfi");
			
			System.out.println("Enter your desired quantity: ");
			fo.quantity =sc.nextInt();
			fo.orderedItems += "\nDry Fruit Barfi            250/-";
			fo.total += 250 * fo.quantity;
			break;
			
		case 2:
			System.out.println("You have chosen Gulab Jamun");
			
			System.out.println("Enter your desired quantity: ");
			fo.quantity =sc.nextInt();
			fo.orderedItems += "\nGulab Jamun            280/-";
			fo.total += 280 * fo.quantity;
			break;
			
		case 3:
			System.out.println("You have choosen Ras Malai ");
			
			System.out.println("Enter your desired quantity: ");
			fo.quantity =sc.nextInt();
			fo.orderedItems += "\nRas Malai            270/-";
			fo.total += 270 * fo.quantity;
			
			break;
			
		case 4:
			System.out.println("You have choosen Blue Berry Ice-cream ");
			
			System.out.println("Enter your desired quantity: ");
			fo.quantity =sc.nextInt();
			fo.orderedItems += "\nBlue berry Ice-cream      250/-";
			fo.total += 250 * fo.quantity;
			
			break;
			default:
				System.out.println("---Invalid input------");
				dessertDisplay();
				break;
				
		}
//		System.out.println("bill is "+fo.total);
	}
	public static void main(String args[]) {
		
		Dessert dc = new Dessert();
	dc.dessertDisplay();
	

		
		
//		System.out.println(+stotal);
		
	}

}
