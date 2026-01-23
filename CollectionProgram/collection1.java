import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collection1 {
    public static void main(String[] args) {
        List <Object> l = new ArrayList<>();
        l.add(12);l.add(11);l.add(90);l.add(45);l.add(56);
        l.add(22);l.add(2);l.add(32);l.add("hello");l.add("world");

        for(int i = 0 ;i<l.size();i++){
            if(i>=48 && i<= 57){
                System.out.println(l.get(i));
            }
        }

        // for (Integer x : l) {
        //     System.out.println(x);
        // }

        //l.forEach(n->System.out.println(n));

        // Iterator<Object> itr = l.iterator();
        // while (itr.hasNext()) {
        //     System.out.println(itr.next());
        // }
    }
}
