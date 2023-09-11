package OOPs;

public class Cars{ //implements Comparable<Cars>{
	int price;
	int speed;
	String color;

	public Cars() {
		// TODO Auto-generated constructor stub
	}

	public Cars(int price, int speed, String color) {
		this.price = price;
		this.speed = speed;
		this.color = color;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "P: "+ this.speed +" S: "+this.speed +" C: "+this.color ;
	}

/*	@Override
	public int compareTo(Cars o) {
		// TODO Auto-generated method stub
		return this.speed-o.speed; 10 20 30 40 50 
	}		
*/
//	@Override
//	public int compareTo(Cars o) {
//		// TODO Auto-generated method stub
//		return o.price-this.price; // 50 40 30 20 10
//	}
	
//	Basis of String
	/*
	 * 
	@Override
	public int compareTo(Cars o) {
		// TODO Auto-generated method stub
		return this.color.compareTo(o.color); //A B C D
	}
	 */
}
 