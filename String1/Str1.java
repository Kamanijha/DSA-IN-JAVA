

public class Str1 {
    public static void main(String[] args) {
		String s="abcd";
		//Run loop from start
		// for(int i=0;i<s.length();i++){
		// 	System.out.println(s.charAt(i));
        // }
        
        //Run loop from end
		// for(int i=s.length()-1;i>=0;i--)
		// 	System.out.println(s.charAt(i));

        //Run loop from start
		for(char c:s.toCharArray())
			System.out.println(c);
	}
}
