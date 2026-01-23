import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class map {
    public static void main(String[] args) {
        Map<Integer,String> m = new LinkedHashMap<>();
        m.put(2,"subham" ); m.put(3,"raj" ); m.put(4,"rohan" );
         m.put(5,"anup" ); m.put(6,"kamani" ); m.put(7,"puja" );
         
         // THIS FOR EACH LOOP USING LEMENDA EXPRESSION
        // m.forEach((k,v)->System.out.println(k+ "--> "+ v));

        // THIS USING KEYSET ()
        //  Set<Integer> keys =  m.keySet();
        //  for(int k : keys){
        //     System.out.print(k + " ");
        //  }

        // Collection<String> val =  m.values();
        // for(String v : val){
        //     System.out.print(v + " ");
        //  }
        
        // THIS IS USING ENTRYSET()
        Set<Map.Entry<Integer,String>>ent = m.entrySet();
        for (Entry<Integer, String> va : ent) {
            System.out.println(va);
        }
    }
}
