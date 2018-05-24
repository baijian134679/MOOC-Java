package Main;

import java.util.Scanner;

public class Main_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x,type;
		int mask = 1;
		
		x = in.nextInt();
		if (x < 0){
			System.out.print("fu ");
			x = -x;
		} 
		int t = x;
		while( t > 9){
			t /=10;
			mask *= 10;
		}
			do{
				type = x / mask;
				switch(type){
					case 1:
						System.out.print("yi");break;
					case 2:
						System.out.print("er");break;
					case 3:
						System.out.print("san");break;
					case 4:
						System.out.print("si");break;			
					case 5:
						System.out.print("wu");break;			
					case 6:
						System.out.print("liu");break;			
					case 7:
						System.out.print("qi");break;			
					case 8:
						System.out.print("ba");break;			
					case 9:
						System.out.print("jiu");break;
					case 0:
						System.out.print("ling");break;											
				}
			if (mask > 9){
				System.out.print(" ");
			}
			x %= mask;
			mask /=10;
		}while( mask > 0);
		
	}

}
