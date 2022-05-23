package javaProgram;

public class Palindrom {

	public static void main(String[] args) {
		String name = "NAMAN";
		String temp = "";     
       for(int i=name.length()-1;i>=0;i--) {
    	  temp=temp+ name.charAt(i);
       }boolean t=temp.equalsIgnoreCase(name);
    		   System.out.println(t);
    	  
	
	
	}
       
	}


