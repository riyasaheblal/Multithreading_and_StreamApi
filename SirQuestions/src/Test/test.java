package Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
public static void main(String[] args) {
	String s="Riya is a good learner";
	char[] ch=s.toLowerCase().toCharArray();
	Map<Character, Integer> m=new HashMap<>();
	for(char c: ch) {
		int count=0;
		for(char d: ch) {
			if(c==d) {
				count++;
	
			}
		}
		m.put(c, count);

	}
	System.out.println(m);
}
}
