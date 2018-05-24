package Main;

import java.util.Scanner;

public class Main_8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,t;
		int[] s = new int[32];
		int i =31;
		
		n = in.nextInt();
		t = n;
		while( t>0 ) {
			s[i] = t%2;
			t/=2;
			i--;
		}
		if( n==0 ) {
			System.out.println("32");
		}else if( n<0 ) {
			System.out.println("0");
		}else {
			for ( i=0; i<32; i++ ) {
				if( s[i]>0 ) {
					System.out.println(i);
					break;
				}
			}
		}
		in.close();
	}
	
}
