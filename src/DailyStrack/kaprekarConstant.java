package DailyStrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class kaprekarConstant {

	public static void main(String[] args) {
	
		String str = "Java";
		
		List<String> list = new ArrayList<>();
		list.add(str);
		
		
		Map<Character, Long> map = list.stream()
									.flatMap(n->n.chars().mapToObj(c-> (char)c))
									//.filter(e->e.contains(e))
									.collect(Collectors.groupingBy(s->s, Collectors.counting()));
		
		System.out.println(map);
		
		
		Map<Character, Integer> map1 = new HashMap<>();
		
		
		for(int i =0;i<str.length();i++) {
			
			char c = str.charAt(i);
			
			if(map1.containsKey(c)) {
				int cnt = map1.get(c);
				map1.put(c, ++cnt);
			} else {
				map1.put(c, 1);
			}
			
		}
		
		System.out.println(map1);
									
		
	}

}
