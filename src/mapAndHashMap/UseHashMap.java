package mapAndHashMap;

import java.util.HashMap;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {

        Map<String, String> state = new HashMap<String,String>();
        state.put("USE", "CA");
        state.put("UK", "London");
        state.put("Canada", "Toronto");
        state.put("Australia", "Sydney");

        System.out.println(state.get("Canada"));

    }
}
