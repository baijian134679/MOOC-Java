package Main;

import java.util.Scanner;

public class Main_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int cnt = 0;
		int m,n,sum=0;
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		m = in.nextInt();
		while ( cnt < m ) {
			int i;
			int isPrime = 1;	
			for ( i=2; i<x; i++ ) {
				if ( x % i == 0 ) {
					isPrime = 0;
					break;
				}
			}
			if ( isPrime == 1 ) {
					cnt ++;
					if( m > n){
						if( cnt >= n ){
						sum += x;
					}	
				}else {
					sum = x;
				}	
			}	
				x++;
			} 
		System.out.println(sum);
	}

}
