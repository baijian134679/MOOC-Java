package Main;

import java.util.Scanner;

public class Main_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = 0;
		int even = 0;
		int odd = 0;
		do {
			number = in.nextInt();
			if( number == -1 ) {
				break;
			}
			if( number%2 == 0 ) {
				even++;
			}else {
				odd++;
			}
		}while ( number != -1 );
		System.out.println(odd+" "+even);
	}

}
