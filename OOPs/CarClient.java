package OOPs;

import java.util.Comparator;

public class CarClient{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cars[] arr = new Cars[5];
		Cars cars[] = new Cars[5];
		cars[0] = new Cars(1000, 20, "Black");
		cars[1] = new Cars(200, 10, "White");
		cars[2] = new Cars(345, 3, "Yellow");
		cars[3] = new Cars(8907, 6, "Red");
		cars[4] = new Cars(34, 89, "Grey");
		Display(cars);
		System.out.println("******************");
//		sort(cars, new CarCompareterSpeed());
//		sort(cars, new CarComparaterPrice()); 
		sort(cars, new CarComparaterColor());
		Display(cars);
//		By deafult Java's Classes has parent class as its Object class 
/*		OOPs.Cars@626b2d4a
		OOPs.Cars@5e265ba4
		OOPs.Cars@156643d4
		OOPs.Cars@123a439b
		OOPs.Cars@7de26db8
	*/	
//		After overriding the Tostring Method
		/*
		 *  P: 20 S: 20 C: Black
 			P: 10 S: 10 C: White
			P: 3 S: 3 C: Yellow
			P: 6 S: 6 C: Red
			P: 89 S: 89 C: Grey

		 */
	}
	private static void Display(Cars[]cars) {
		// TODO Auto-generated method stub
		for(int i =0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
	}
	/*
	public static <T extends Comparable<T>>void sort(T[] arr) {
		  for(int turn =1;turn<arr.length;turn++) {
			  for(int i =0;i<arr.length-turn ;i++) {
				  if(arr[i].compareTo(arr[i+1])>0) {
					  T t = arr[i];
					  arr[i] = arr[i+1];
					  arr[i+1] = t;
				  }
			  }
		  }
		}
	 */
	public static <T>void sort(T[] arr,Comparator<T> comp) {
		  for(int turn =1;turn<arr.length;turn++) {
			  for(int i =0;i<arr.length-turn ;i++) {
				  if (comp.compare(arr[i],arr[i+1])>0) {
					  T t = arr[i];
					  arr[i] = arr[i+1];
					  arr[i+1] = t;
				  }
			  }
		  }
		}
}
