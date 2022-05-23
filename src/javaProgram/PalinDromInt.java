package javaProgram;

public class PalinDromInt {

	public static void main(String[] args) {
	int num=121;
	int rev=0;
	int temp=0;
	temp=num;
	while(num>0) {
		rev=(rev*10)+num%10;
		num=num/10;		
	}
    System.out.println(rev);
    System.out.println(num);
    if(temp==rev) {
    	System.out.println("it is palindrom");
    }
    else {
    	System.out.println("it is not palindrom");
    }
	}

}
