import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Nirav on 23-02-2016.
 */
public class MyTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        System.out.println("Before modification:" + map.toString());
        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()) {
            String keyStr = it.next();
            System.out.println(keyStr);
            if("2".equals(keyStr)) {
                map.put("2",22);
                break;
            }
        }
        System.out.println("After modification:" + map.toString());
    }
}
