package Main;

import java.util.Scanner;

public class Main_7_2 {
	public static int test_number(int number){  
	    int i,sum=0;  
	    for(i=1;i<number;i++){  
	        if(number%i==0){  
	            sum+=i;  
	        }  
	    }  
	    if(sum==number){  
	        return 1;  
	    }else{  
	        return 0;  
	    }  
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int m,n,i,count=0;  
		  
	   n = in.nextInt();
	   m = in.nextInt();
	    for(i=n;i<=m;i++)
	    {  
	        if(test_number(i)==1)
	        {   
	        	if(count!=0)
	            {  
	                System.out.print(" ");  
	            }
	            System.out.print(i);
	            count++;
	        }  
	    }  
	    if(count==0)
	    {  
	        System.out.println();  
	    }  
	}

}
