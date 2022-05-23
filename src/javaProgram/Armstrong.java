package javaProgram;

public class Armstrong {
public static int power(int num, int power) {
	
	return 0;
}
	public static void main(String[] args) {
		
		int num=153;
		int chek=0;
		int a=num;
		int last;
		int n = num, pow=0;
		while (n>0)
		{
			n=n/10;
		pow++;	
		}
		while(num>0) {
			
			last=num%10;
			chek=chek+(int)power(last, pow);
			num=num/10;
		
		}
         if(chek==a) {
        	 System.out.println("it is armstrong number");
         }
         else {
        	 System.out.println("it is not armstrong number");
         }
	}

}
