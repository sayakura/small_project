class Problem{
	public static void main(String[] args) {
		System.out.println("the dots go like:");
		System.out.println("--------");
		System.out.println("        |");
		System.out.println("        |");
		System.out.println("________|");
		System.out.println("|        ");
		System.out.println("|        ");
		System.out.println("|        ");
		System.out.println("|_______->\nNow go backward!");
		System.out.println("-------->");
		System.out.println("|        ");
		System.out.println("|        ");
		System.out.println("|_______ ");
		System.out.println("        |");
		System.out.println("        |");
		System.out.println("        |");
		System.out.println("  ______|");

		String s = "move right,move right(2 steps),length +1\n1 x x\nx x x\nx x x\n";
		System.out.println(s);
		s = "move down,move left,move left, move down(4 steps)，length +1\nx 2 1\nx x x\nx x x\n";
		System.out.println(s);
		s = "move right, move right, move up, move left,move left,move up(6 steps) length+1\nx x x\n2 3 x\n1 x x\n";
		System.out.println(s);
		s = "move right,move right,move down, move left,move left,move down,move right,move right(8 steps), length+1\n1 x x\n2 3 4\nx x x\n";
		System.out.println(s);
		s = "x x x\n4 5 x\n3 2 1\n";
		System.out.println(s);
	}

}