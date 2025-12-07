

public class Program3 {
    public static void main(String[] args) {
        String s1="mohan";
		String s2="mohan";
		String s3="mohan";
		String s4="mohan";
		s2="mohini";
		System.out.println("s1 is: "+s1);
		System.out.println("s2 is: "+s2);
		System.out.println("s3 is: "+s3);
		System.out.println("s4 is: "+s4);
        System.out.println("s4 is: "+s1.hashCode());
        System.out.println("s4 is: "+s2.hashCode());
        System.out.println("s4 is: "+s3.hashCode());
        System.out.println("s4 is: "+s4.hashCode());

    }
}
