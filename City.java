import java.util.Scanner;

public class City {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void cityCentre() {
		int choice = 0;
		System.out.println("You are in the city");
		sleep();
		System.out.println("Where would you like to go? 1.)Work 2.)Casino");
		choice = scan.nextInt();
		switch (choice) {
		
		case 1:
			work();
			break;
		case 2:
			casino();
			break;
		}
		
	}
	


	public static void casino() {
		Casino.lobby();
		
	}
	public static void work() {
		int choice;
		System.out.println("What job would you like to do?1.)Chop some wood - 100 2.)Clean the toilets - 200 3.)Help the elderly");
		choice = scan.nextInt();
		switch (choice) {
		case 1:
			System.out.println("You decide to chop some wood");
			workSleep();
			Money.money += 100;
			sleep();
			System.out.println("You earned 100!");
			break;
		case 2:
			System.out.println("You decide to clean the toilets");
			workSleep();
			workSleep();
			Money.money += 200;
			sleep();
			System.out.println("You earned 200!");
			break;
		case 3:
			System.out.println("You decide to help the elderly");
			workSleep();
			workSleep();
			workSleep();
			workSleep();
			Money.money += 400;
			sleep();
			System.out.println("You earned 400!");
			break;
		}
		System.out.println("You now have " + Money.money  + " money");
		sleep();
		System.out.println("Would you like to work again? 1.)Yes 2.)No");
		choice = scan.nextInt();
		switch (choice) {
		case 1:
			work();
			break;
		case 2:
		System.out.println("You go back to the city centre");
		cityCentre();
		}
		
		
	}

	private static void sleep() {
		try {
			Thread.sleep(750);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void smallSleep() {
		try {
			Thread.sleep(750);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void workSleep() {
	System.out.println("working");
	smallSleep();
	System.out.println("Working.");
	smallSleep();
	System.out.println("Working..");
	smallSleep();
	System.out.println("working...");
	smallSleep();
	System.out.println("Working..");
	smallSleep();
	System.out.println("Working.");
	smallSleep();
	System.out.println("working..");
	smallSleep();
	System.out.println("working...");
	smallSleep();
	}
	
}
