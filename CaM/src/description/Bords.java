package description;

public class Bords {
	
	private int x;
	private  int y;
	
	public Bords(int x, int y){
		
		this.x=x;
		this.y=y;
	}
	
	public int getX(){
		
		return x;
	}
public int getY(){
		
		return y;
	}

  public String toString(){
	  
	  return "[" +x +"," +y +"]"; 
  }
  
  public boolean equals(Bords b){
	  
	  return this.x==b.getX() && this.y==b.getY();
  }
}
