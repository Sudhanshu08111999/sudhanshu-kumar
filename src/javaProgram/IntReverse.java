package javaProgram;

public class IntReverse {

	public static void main(String[] args) {
int a[]= {1,2,3,4,5,6,7,8,9,};
int b=a.length;
for(int i=b;i>=1;i--) {
	System.out.println(i);
}
	
	int num=1234;
	int rev=0;
	while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
	}
	System.out.println(rev);
	
	
	
	
	
	}
	
	
	
	

}
