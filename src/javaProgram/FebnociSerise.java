package javaProgram;

public class FebnociSerise {

	public static void main(String[] args) {
		revers();
//  1 3 5 8 13
		int a=0;
		int b=1;
		int c;
		System.out.println(a+ " "+b);
		for(int i=0;i<=10;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}
	public static void revers() {
		String name="Sudhanshu";
		String temp="";
		for(int i=name.length()-1;i>=0;i--) {
			temp=temp+name.charAt(i);
		}
		System.out.println(temp);
	}

}
