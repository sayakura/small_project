import java.util.Scanner;
import java.util.Random;
public class Guess{
	public static void playerGuess(Board obj){
		int intRow, intCol;
		boolean isHorizontalBoolean;
		do{
			Scanner userInput = new Scanner(System.in);
			System.out.print("Which row?(A-J)");
			char row = Character.toUpperCase(userInput.next().charAt(0));
				while(!Character.isLetter(row)||!Algorithm.checkRowIsInRange(row)){
					System.out.print("Which row?(A-J) Your input is invalid.");
					row = Character.toUpperCase(userInput.next().charAt(0));
				} 
			intRow = (int)(row)-65;// convert to integer 
			System.out.println(intRow);
			System.out.print("Which cloumn?(1-10)");
			String col = userInput.next();
				while(!Algorithm.checkColIsInRange(col)){
					System.out.print("Which cloumn?(1-10) Your input is invalid.");
					col= userInput.next();
				}
			intCol = Integer.parseInt(col) -1;// convert to integer 
			System.out.println(intCol);
		}while(obj.returnStatus(intRow,intCol).equals("X") && obj.getShip(intRow,intCol).getVisibility());
		if(obj.returnStatus(intRow,intCol).equals("X")){
			System.out.println("You got a hit");
			Board.playerHits++;
		}else{
			obj.sink(intRow,intCol);
			System.out.println("Nope,that was a miss.");	
		}
		obj.setVisibility(intRow,intCol,true);
		System.out.println("Total Hits "+Board.playerHits+" out of 17 ");
		System.out.println(obj);
	}
	public static void computerGuess(Board obj){
		Random randomizer = new Random();
		int row,col;
		do{
			row = randomizer.nextInt(10);
	        col = randomizer.nextInt(10);
	    }while(obj.returnStatus(row,col).equals("X") && obj.getShip(row,col).getVisibility());
	    if(obj.returnStatus(row,col).equals("X")){
			System.out.println("Computer got a hit");
			Board.computerHits++;
		}else{
			obj.sink(row,col);
			System.out.println("Computer missed.");	
		}
		obj.setVisibility(row,col,true);
		System.out.println("Total Hits "+Board.computerHits+" out of 17 ");
	}
}