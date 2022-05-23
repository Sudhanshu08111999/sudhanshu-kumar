package javaProgram;

public class UpperCaseWithoutUsingMethod {

	public static void main(String[] args) {

		String name="sudhanshu";
	//	char st[]=name.toCharArray();
		for(int i=0;i<name.length();i++) {
			char st=name.charAt(i);
			if(st>='a'&& st<='z') {
				st=(char)(st-'a'+'A');
				name=name+st;
				
			}
			else if(st>='A'&& st<='Z') {
				st=(char)(st+'a'-'A');
				name=name+st;
								
			}else {
				name=name+st;

			}
		}
System.out.println(name);
  
		
	}

}
