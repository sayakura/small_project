public class Algorithm{
	public static int ships = 17;
	public static boolean checkIfIsHorizontal(String isHorizontal){
		 if(isHorizontal.charAt(0) == 'h' || isHorizontal.charAt(0) == 'H') return true;
	     else if(isHorizontal.charAt(0) == 'v'|| isHorizontal.charAt(0) == 'V') return false;
		 return (isHorizontal.equals("Horizontal"))? true: false;
	}
	public static boolean checkRowIsInRange(char ch){
		return (((int)ch) < 75 && ((int)ch) >= 65) ? true : false;
	}
	public static boolean checkColIsInRange(String i){
		for(int a = 0; a < i.length(); a++) if(!Character.isDigit(i.charAt(a))) return false; // check if all letters is digit or not;
		return (Integer.parseInt(i) >= 0 && Integer.parseInt(i) <= 10) ? true : false; // if is between 0 - 9, return true, else return false;
	}
	public static boolean checkIfExceededTheBoarderOrOverLappedAShip(int row, int col, boolean isHorizontal, int shipLength, Board obj){
		if(isHorizontal) if(10 - col < shipLength ) {System.out.println("Your Ship was exceeded the boarder or overlapped another ship. please try Again.(col)");return false;}//return false if exceeded the boarder or overlapped another ship
		if(!isHorizontal){ if(10 - row < shipLength) {System.out.println("Your Ship was exceeded the boarder or overlapped another ship. please try Again.(row)"); return false;}}
		if(!checkIfOverLappedAShip(row, col, isHorizontal, shipLength, obj)){System.out.println("Your Ship was exceeded the boarder or overlapped another ship. please try Again.(overlapped)");return false;}
		return true;
	}
	public static boolean checkIfExceededTheBoarderOrOverLappedAShipComputerVersion(int row, int col, boolean isHorizontal, int shipLength, Board obj){
		if(isHorizontal){if(9 - col < shipLength ) return false;}//return false if exceeded the boarder or overlapped another ship
		if(!isHorizontal){if(9 - row < shipLength)  return false;}
		if(!checkIfOverLappedAShip(row, col, isHorizontal, shipLength, obj)) return false;
		return true;
	}
	public static boolean checkIfOverLappedAShip(int row, int col, boolean isHorizontal, int shipLength, Board obj){
		if(!isHorizontal) for(int i = 0; i < shipLength; i++) if(obj.getShip(row, col).toString().equals("X")||obj.getShip(row+i, col).toString().equals("X")) return false;
		if(isHorizontal)for(int i = 0; i < shipLength; i++) if(obj.getShip(row, col).toString().equals("X")||obj.getShip(row, col+i).toString().equals("X")) return false;
		return true;
	}
}