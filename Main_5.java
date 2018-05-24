package Main;

import java.util.Scanner;

public class Main_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int s1,s2;
		int i;
		int cnt = 0;
		int[] number = new int[101];
	//  用数组存放系数	
		while (cnt<2){
			s2 = in.nextInt();
			s1 = in.nextInt();
			number[s2] += s1;
			if (s2 == 0){
				cnt ++;
			}
		}
//		遍历数组中不为0的次幂，并输出 
		for ( i=100; i > 1; i--) {
			if ( number[i] != 0 && number[i] !=1 && number[i] != -1 ) {
				cnt ++;
				if ( cnt==3 ){
					System.out.printf("%dx%d",number[i],i);
				}else {
					if( number[i] >0) {
						System.out.printf("+%dx%d",number[i],i);
					}else{
						System.out.printf("%dx%d",number[i],i);
					}
				}
			}else if (number[i] ==1 ){
				System.out.printf ("+x%d",i);
			}else if (number[i] ==-1){
				System.out.printf("-x%d",i);
			}
		}
	//  输出次幂为1的系数
		if ( number[1] < -1 ) {
			System.out.printf("%dx",number[1]);
		}else if( number[1] >1 ){
			System.out.printf("+%dx",number[1]);
		}else if( number[1] == 1){
			System.out.printf("+x");
		}else if( number[1] == -1){
			System.out.printf("-x");
		}
//		输出0次幂的系数，不包括0次幂系数为0。且输出结果为0的情况	
		if ( number[0] <0 ){
			System.out.printf("%d\n", number[0]);
		}else if( number[0] >0 ){
			System.out.printf("+%d\n",number[0]);
		}else{
			System.out.printf("0");
		}
	}

}
