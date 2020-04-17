package others;

import java.util.StringTokenizer;

public class TokenizerPractice {

	public static void main(String[] args) {
		
		 String str = "1:2:3:4:5";
		 StringTokenizer s = new StringTokenizer(str,":");
		 while(s.hasMoreTokens()) {
			 System.out.println(s.nextToken());
		 }

	}

}
