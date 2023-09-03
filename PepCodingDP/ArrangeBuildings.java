package PepCodingDP;

import java.util.Scanner;

public class ArrangeBuildings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
		int n = sc.nextInt();
		int ob = 1;
		int os = 1;
		for(int i = 2;i<=n;i++) {
			int nb = os;
			int ns = os+ob;
			os = ns;
			ob= nb;
		}
		int total = os+ob;
		total= total*total;
		System.out.println(total);
	}

}
