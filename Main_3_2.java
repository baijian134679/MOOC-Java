package Main;

import java.util.Scanner;

public class Main_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double m = 0.5;
		int n = 0;
		int count = 0;
		int y = 0;
		int number;
		number = in.nextInt();
		while ( number > 0 ) {
			y = number%10;
			count++;
			m*=2;
			if ( number%10%2 == count%2 ) {
				n+=m;
			}
			number /= 10;
		}
		System.out.println(n);
	}

}
