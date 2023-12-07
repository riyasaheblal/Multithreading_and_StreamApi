package Test;


public class PalindromeString {
public static void main(String[] args) {
	String s1="actW";
	String s2="catw";
	if(s1.length()!=s2.length()) {
		System.out.println("not a plaindrome");
	}else {
		char[] ch1=s1.toLowerCase().toCharArray();
		char[] ch2=s2.toLowerCase().toCharArray();

	    for (int i = 0; i <ch1.length; i++) {
		for (int j = i+1; j < ch1.length; j++) {
			if(ch1[i]>ch1[j]) {
				char ch3=ch1[i];
				ch1[i]=ch1[j];
				ch1[j]=ch3;
			}
			if(ch2[i]>ch2[j]) {
				char ch3=ch2[i];
				ch2[i]=ch2[j];
				ch2[j]=ch3;
			}
			
		}	
		
		}
	    String s3=new String(ch1);
	    String s4=new String(ch2);
	    System.out.println(s3.equals(s4));
	    System.out.println(ch2);
	    if(s3.equals(s4)) {
	    System.out.println("its palindrome");
	    }
	}
}
}
