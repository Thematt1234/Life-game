import java.util.Random;
import java.util.Scanner;

public class Casino {
	
	static int bet;
	static Scanner scan = new Scanner(System.in);

	
	public static void lobby() {
		int choice = 0;
		System.out.println("Welcome to the casino");
		sleep();
		System.out.println("what would you like to play? 1.)Roulette 2.) Blackjack 3.)Leave casino ");
		choice = scan.nextInt();
		switch (choice) {
		case 1:
			roulette();
			break;
		case 2:
			//blackjack not implemented
			blackjack();
			break;
		case 3:
			City.cityCentre();
		}
		
	}

	public static void roulette() {
		int rou = 0;
		int guess;
		Random rand = new Random();
		int num = rand.nextInt(37);
		int colour = rand.nextInt(2);

		if (Money.money == 0) {
			lose();
		}

		System.out.println("Welcome to roulette!");
		sleep();
		System.out.println("place your bet, you have " + Money.money);
		bet();

		Money.money -= bet;
		System.out.println("Your bet is " + bet);
		System.out.println("now choose 1)Black  2)Red  3)Numbers");
		rou = scan.nextInt();
		switch (rou) {
		case 1:
			if (colour == 0) {
				System.out.println("You win");
				Money.money += bet;
				Money.money += bet;
				sleep();
				System.out.println("Play again? 1)Yes 2)No");
			} else {
				System.out.println("Sorry it landed on red");
				sleep();
				System.out.println("Play again? 1)Yes 2)No");

			}
			break;
		case 2:
			if (colour == 1) {
				System.out.println("You win");
				Money.money += bet;
				Money.money += bet;
				sleep();
				System.out.println("Play again? 1)Yes 2)No");
			} else {
				System.out.println("Sorry it landed on black");
				sleep();
				System.out.println("Play again? 1)Yes 2)No");
			}
			break;
		case 3:
			System.out.println("Choose a number between 0 and 36");
			guess = scan.nextInt();
			if (guess == num) {
				System.out.println("Winner");
				bet *= 37;
				Money.money += bet;
				System.out.println("play again? 1) yes");
				break;

			} else {
				System.out.println(num);
				System.out.println("you lose you have " + Money.money + " Money left,  try again? 1)Yes 2)No");
			}
			break;
		}
		rou = scan.nextInt();
		switch (rou) {
		case 1:
			roulette();
		case 2:
			lobby();
			break;
		}

	}

	public static void blackjack() {
		int[] heart = {1,2,3,4,5,6,7,8,9,10};
		int[] spade = {1,2,3,4,5,6,7,8,9,10};
		int[] clubs ={1,2,3,4,5,6,7,8,9,10};
		int[] diamonds = {1,2,3,4,5,6,7,8,9,10};
		int[] red= {1,2,3,4,5,6,7,8,9,10};
		int[] black ={1,2,3,4,5,6,7,8,9,10};
		
		
		System.out.println();


		System.out.println("Welcome to blackjack");
		sleep();
		System.out.println("Place your bet");
		bet();

	}

	public static void bet() {
		bet = scan.nextInt();
		if (bet > Money.money) {
			System.out.println("You cant place that much try again");
			bet();
		}
	}
	
	public static int getRandom(int[] array) {
		int rnd = new Random().nextInt(array.length);
		return array[rnd];
	}

	public static void lose() {
		System.out.println("You have no money left, you must leave the casino");
		City.cityCentre();
	}

	public static void sleep() {
		try {
			Thread.sleep(750);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

	



