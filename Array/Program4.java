public class Program4 {
    public static void main(String[] args) {
        int a=10;
		int b=20;

		System.out.println("a before swap is: "+a);
		System.out.println("b before swap is: "+b);

		int temp=a;
		a=b;
		b=temp;

		System.out.println("a after swap is: "+a);
		System.out.println("b after swap is: "+b);	
    }
}
