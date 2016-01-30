import java.util.Scanner;
import java.util.Random;
public class Place{
	private static final int[] ships = {2, 3, 3, 4, 5};
	private static int intRow, intCol;
	private static boolean isHorizontalBoolean;
	static void script(Board obj){
		Scanner userInput = new Scanner(System.in);
		for (int i = 0 ; i < ships.length; i++) {
			do{
				System.out.println("Now you need to place a ship of length "+ ships[i]);//ask for row   +ships[i]
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

				System.out.print("Horizontal or Vertical?");//as for direction
				String isHorizontal = userInput.next();
				isHorizontalBoolean = Algorithm.checkIfIsHorizontal(isHorizontal);
			
			}while(!Algorithm.checkIfExceededTheBoarderOrOverLappedAShip(intRow, intCol, isHorizontalBoolean, ships[i], obj));
			place(obj, intRow, intCol, isHorizontalBoolean, ships[i]);
			System.out.println(obj);
		}
	}
	public static void place(Board obj, int x, int y, boolean ishorizontal, int length){
		obj.setShip(x, y, ishorizontal, length);
	}
	public static void computerPlacing(Board obj){
		for(int i = 0; i < ships.length; i++){
			Random ran = new Random();
			boolean isHorizontal = ran.nextBoolean();
			int row = (int) (Math.random()*5);
			int col = (int) (Math.random()*5);
			boolean test = true;
			while(test){
				if(!Algorithm.checkIfExceededTheBoarderOrOverLappedAShipComputerVersion(row, col, isHorizontal, ships[i], obj)){
					row = (int) (Math.random()*5);col = (int) (Math.random()*5);isHorizontal = ran.nextBoolean();
				}else{
					place(obj, row, col, isHorizontal, ships[i]);
					test = false;
				}
			}//while loop
		}
	}//guessing computer
}