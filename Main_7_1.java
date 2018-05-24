package Main;

import java.util.Scanner;

public class Main_7_1 {
	public static int prime(int number)
	{

		int i;
		int isPrime = 1;
			
		for ( i=2; i<number; i++ ) {
			if ( number % i == 0 ) {
				isPrime = 0;
				break;
			}
		}
		if ( isPrime == 1 ) {
			return 1;
		}else{
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number;
		int i=2;
		number = in.nextInt();
		
		if (prime(number)==1){
			System.out.print(number+"="+number);
		}else{
			System.out.print(number+"=");
			while(number/i>0){
				if(number!=i){
					if(number%i==0&&prime(i)==1){
						System.out.print(i+"x");
						number /= i;
					}else{
						i ++;
					}	
				}else{
					break;
				}
			}
			System.out.println(i);
		}
	}

}
