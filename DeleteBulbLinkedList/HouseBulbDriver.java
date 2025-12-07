

public class HouseBulbDriver {
    public static void main(String[] args) {
        House h1 = new House();
        Bulb b1 = new Bulb("red");
        h1.head = b1;
        Bulb b2 = new Bulb("green");
        b1.next = b2;

        Bulb b3 = new Bulb("yellow");
        b2.next= b3;
        Bulb b4 = new Bulb("white");
        b3.next = b4;

        Bulb temp = h1.head;
        while (temp != null) {
            System.out.println(temp.color);
            temp = temp.next;
        }
        System.out.println("null");
    }
}
