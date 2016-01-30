class Sudoku{
	int[][] grid;
	Sudoku(){
		grid = new int[9][9];
	}
	public String toString(){
		String result = "";
		for(int[] r : grid){
			for(int c : r){
				result += c+" ";
			}
			result += "\n";
		}
	}
	public static void main(String[] args) {
		Sudoku sudoku = 
	}

}