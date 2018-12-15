package mapAndHashMap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UseHashMapList {
    public static void main(String[] args) {
        List<String> cityOfUsa = new ArrayList<String>();
        cityOfUsa.add("NY");
        cityOfUsa.add("PA");
        cityOfUsa.add("OH");
        cityOfUsa.add("CA");

        List<String> cityOfUK = new ArrayList<String>();
        cityOfUK.add("London");
        cityOfUK.add("Burmingham");
        cityOfUK.add("Canton");
        cityOfUK.add("Newhampshire");

        Map<String, List<String>> list = new LinkedHashMap<>();
        list.put("USA", cityOfUsa);
        list.put("UK", cityOfUK);


        for(Map.Entry entry:list.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
    }
}
