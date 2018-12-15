package mapAndHashMap;

import java.util.HashMap;
import java.util.Map;

public class UseMap {
    public static void main(String[] args) {
        Map<Integer, String> state = new HashMap<Integer,String>();
        state.put(1, "CA");
        state.put(2, "FL");
        state.put(3, "PA");
        state.put(4, "OH");

        System.out.println(state.get(1));
        System.out.println(state.get(4));

    }

}
