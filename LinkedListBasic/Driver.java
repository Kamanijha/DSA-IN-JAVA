

public class Driver {
    public static void main(String[] args) {
        House h1 = new House();
        h1.name = "abce";
        System.out.println(h1.name);
        System.out.println(h1.name.length());
        System.out.println(h1.name.toUpperCase());
        System.out.println(h1.name.charAt(2));
    }
}
