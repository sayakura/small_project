import java.util.Scanner;
public class Start{
	public static void main(String[] args) {
		script();
	}
	public static void script(){
		System.out.println("Welcome to Battleship!");
		printLine();
		//////////////////Set things up///////////////////////
		boolean play = true;                                //
		Board playerBoard = new Board();                    //
		Board computerBoard = new Board();                  //
		Scanner enter = new Scanner(System.in);             //
		//////////////////////////////////////////////////////
		while(play){
			//initialize all classes
			System.out.println(playerBoard);
			Place.script(playerBoard);
			System.out.println("Hit enter for the enemy to choose their ship locations.");
			enter.nextLine();
			Place.computerPlacing(computerBoard);
			System.out.println("The enemy has placed their ships.");  
		    System.out.println("Hit enter to start guessing.");  
		    enter.nextLine();
		    System.out.println("Hit enter for your turn"); 
		    enter.nextLine();
		    System.out.println("Enemy grid:"); 
		    playerBoard.visibility(false);
			computerBoard.visibility(false);
			System.out.println(computerBoard);
			boolean gameKeepGoing = true;
			while(Board.playerHits < 17 || Board.computerHits < 17){
				if(Board.playerHits == 17 ){
					System.out.println("You Win !");
					play = false;
					break;
				}else if(Board.computerHits == 17){
					System.out.println("Computer Win!");
					play = false;
					break;
				}
				enter.nextLine();
				System.out.println("It's your turn to guess."); 
				enter.nextLine();
				Guess.playerGuess(computerBoard);
				enter.nextLine();
				Guess.computerGuess(playerBoard);
				System.out.println(playerBoard);
				enter.nextLine();
				System.out.println("Enemy grid:"); 
				System.out.println(computerBoard);
			}
			play = false;
		}//while
	}
	public static void printLine(){
		System.out.println("______________________");
	}
}