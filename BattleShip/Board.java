public class Board{
	public Sea[][] mPoint;
	public static final int ships = 17;
	public static int playerHits = 0;
	public static int computerHits = 0;
	public Board(){
		mPoint = new Sea[10][10];
		for(int r = 0; r < mPoint.length; r++){
			for(int c = 0; c < mPoint[r].length; c++){
				mPoint[r][c] = new Sea(r,c);
			}//for
		}//dor
	}//method
	public void setShip( int x, int y, boolean isHorizontal, int length){
		for(int i = 0; i < length; i++){
			if(isHorizontal){
				mPoint[x][y+i] = new Sea(x,y+i);
				mPoint[x][y+i].setShip();
			}else{
				mPoint[x+i][y] = new Sea(x+i,y);
				mPoint[x+i][y].setShip();
			}
		}	
	}
	public void setVisibility(int x, int y, boolean bool){
		mPoint[x][y].visible(bool);
	}
	public Sea getShip(int x, int y){
		return mPoint[x][y];
	}
	public void visibility(boolean bool){
		for(Sea[] seaC : mPoint){
				for(Sea sea : seaC){
					sea.visible(bool);
				}//for
		}//for
	}
	public void sink(int x, int y){
		mPoint[x][y].sink();
	}
	public String returnStatus(int x, int y){
		return mPoint[x][y].getStatus();
	}
	public String p(){
		String result = "  1 2 3 4 5 6 7 8 9 10\n";
		int i = 65;
		for(Sea[] seaC : mPoint){
			result += (char)i+" ";
				for(Sea sea : seaC){
					result += (sea.getStatus()+" ");
				}//for
			result+="\n";
			i++;
		}//for
		return result;
	}
	@Override
	public String toString(){
		String result = "  1 2 3 4 5 6 7 8 9 10\n";
		int i = 65;
		for(Sea[] seaC : mPoint){
			result += (char)i+" ";
				for(Sea sea : seaC){
					result += (sea.toString()+" ");
				}//for
			result+="\n";
			i++;
		}//for
		return result;
	}
}