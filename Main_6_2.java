package Main;

import java.util.Scanner;

public class Main_6_2 {
	//Check the String
	public static int r( String s )
	{
		int k=2,XOR=s.charAt(1);
		int a1;
		
		while( s.charAt(k)!='*')
		{
			if (s.charAt(k)==',') {
				k++;
				continue;
			}
			XOR ^= s.charAt(k);
			k++;
		}
		XOR %= 65536;
		a1 = Integer.parseInt(s.substring(k+1,k+3),16);
		String []station=s.split(",");  
		if(a1==XOR && station[2].equals("A")){
			return 1;
		}else{
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s;
		String s1;
		boolean c = false;
		int hh=0,mm=0,ss=0;
		
		do {
			s = in.nextLine();
			if( s.startsWith("$GPRMC") && r(s)==1) 
			{
					c = true;
					hh = Integer.parseInt(s.substring(7,9));
					mm = Integer.parseInt(s.substring(9,11));
					ss = Integer.parseInt(s.substring(11,13));
			}
		}while(!s.equals("END"));
		hh += 8;
		if( hh>=24 ) hh-=24;
		if(c) {
			System.out.printf("%02d:%02d:%02d\n", hh, mm, ss);
		}
	}

}
