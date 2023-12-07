package Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StramApi {
public static void main(String[] args) {
	String s="Riya is a good learner";
	
List<Character> li=	s.toLowerCase().chars().distinct().mapToObj(c -> (char) c).collect(Collectors.toList());
System.out.println(li);
Map<Character, Long> charCountMap = s.toLowerCase()
.chars()
.mapToObj(c -> (char) c)
.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	System.out.println(charCountMap);
	
//char repeating more than 2 times	
	
     // Display characters repeating more than 2 times
     charCountMap.entrySet().stream()
             .filter(entry -> entry.getValue() > 2)
             .forEach(entry ->
                     System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue()));
     
     //remove vowles
     String stringWithoutVowels = s.toLowerCase()
             .chars()
             .mapToObj(c -> (char) c)
             .filter(c -> !"aeiou".contains(String.valueOf(c)))
             .map(String::valueOf)
             .collect(Collectors.joining());
     
     System.out.println(stringWithoutVowels);
     
     
     //vowels 3 time print
     String result = s.chars()
             .mapToObj(c -> (char) c)
             .map(c -> "aeiou".contains(String.valueOf(c).toLowerCase()) ? c.toString().repeat(3) : c.toString())
             .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
             .toString();
     
     System.out.println(result);
}
}
