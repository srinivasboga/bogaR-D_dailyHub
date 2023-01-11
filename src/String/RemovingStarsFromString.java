package String;

public class RemovingStarsFromString {

	public static void main(String[] args) {
		
		String str = "leet**cod*e";
		char ch = '*';
		String ss = new String();
		StringBuilder sb = new StringBuilder();
		//System.out.println(str.chars());
		for(int i=0;i<str.length();i++) {
			
			if((str.charAt(i)) == ch) {
				//ss.replace((char) (ss.length()-1), (char) 0);
				sb.deleteCharAt(sb.length()-1);
			} else {
				ss = ss + str.charAt(i);
				sb.append(str.charAt(i));
			}
		}
		
		System.out.println(ss);

		System.out.println(sb);
		
		for(var c:str.toCharArray()) {
			
			if(c=='*') 
				sb.deleteCharAt(sb.length()-1);
			else
				sb.append(c);
		
		}
		
		//System.out.println(sb);
	
	}
}
