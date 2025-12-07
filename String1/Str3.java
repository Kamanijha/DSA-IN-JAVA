
public class Str3 {
    public static void main(String[] args) {
		// String s1="MOHAN";
		
		// System.out.println("MOHAN"==s1.toUpperCase());
		

        // String s1=new String("MOHAN");
		// System.out.println(s1==s1.toUpperCase());
		// System.out.println("mohan"==s1.toLowerCase());

        // String s="Mohan Singh";
		// String s1="Mohan";
		// String s3=s1.concat(" Singh");
		// System.out.println(s1); // mohan
		// System.out.println(s); // mohan singh
		// System.out.println(s3); // mohan sing
		// System.out.println(s==s3); // false
		// System.out.println(s.equals(s3)); // true
		
        // String s1="Mohan";
		// String s2=s1;
		// System.out.println(s1.hashCode()); // Mohan
		// System.out.println(s2.hashCode()); // Mohan
		// System.out.println("===========");
		// s1=s1.concat(" Singh");
		// System.out.println(s1.hashCode()); // Mohan singh
		// System.out.println(s2.hashCode()); // Mohan


        String s1=new String("Mohan");
		String s2=s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("===========");
		s1=s1.concat(" Singh");
		System.out.println(s1);
		System.out.println(s2);
	}
}
