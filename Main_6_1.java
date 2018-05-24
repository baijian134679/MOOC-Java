package Main;

import java.util.Scanner;

public class Main_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		String s;
		do{
			s = in.next();
			if ( s.indexOf('.')==-1 ) {
				System.out.print(s.length()+" ");
			}else {
				if ( s.length() == 1) {
					break;
				}
				System.out.println(s.length()-1);
			}
		}while(s.indexOf('.')==-1);
	}

}
