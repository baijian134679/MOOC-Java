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
	//  ��������ϵ��	
		while (cnt<2){
			s2 = in.nextInt();
			s1 = in.nextInt();
			number[s2] += s1;
			if (s2 == 0){
				cnt ++;
			}
		}
//		���������в�Ϊ0�Ĵ��ݣ������ 
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
	//  �������Ϊ1��ϵ��
		if ( number[1] < -1 ) {
			System.out.printf("%dx",number[1]);
		}else if( number[1] >1 ){
			System.out.printf("+%dx",number[1]);
		}else if( number[1] == 1){
			System.out.printf("+x");
		}else if( number[1] == -1){
			System.out.printf("-x");
		}
//		���0���ݵ�ϵ����������0����ϵ��Ϊ0����������Ϊ0�����	
		if ( number[0] <0 ){
			System.out.printf("%d\n", number[0]);
		}else if( number[0] >0 ){
			System.out.printf("+%d\n",number[0]);
		}else{
			System.out.printf("0");
		}
	}

}
