public class Sea {
	private int mX;
	private int mY;
	private String status;
	private boolean visibility;
	public Sea(int x, int y){
		mX = x;
		mY = y;
		status = "~";
		visibility = true;
	}
	public void setShip(){
		status = "X";
	}
	public void visible(boolean bool){
		visibility = bool;
	}
	public void sink(){
		status = "O";
	}
	public String getStatus(){
		return status;
	}
	public boolean getVisibility(){
		return visibility;
	}
	public String toString(){
		if(visibility == false && status.equals("X")){
			return "~";
		}else{
			return status;
		}
	}
}