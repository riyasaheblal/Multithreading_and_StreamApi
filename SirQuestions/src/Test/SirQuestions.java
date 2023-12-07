package Test;

public class SirQuestions {
public static void main(String[] args) {
	String s="Riya is a good learner";
	String[] s1=s.split(" ");
	String res="";
	for (int i = 0; i < s1.length; i++) {
		res+=s1[i];
		
	}
	System.out.println(res);
}
}
