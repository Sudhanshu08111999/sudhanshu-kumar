package javaProgram;

public class String_Reverse {

	public static void main(String[] args) {

		String name="Sudhanshu kumar gaud";
		String temp="";
		for(int i=name.length()-1;i>=0;i--) {
			temp=temp+name.charAt(i);
		}
         System.out.println(temp);
	}

}
