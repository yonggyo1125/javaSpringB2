package exam01;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        Map<String, String> members = new TreeMap<>(Comparator.reverseOrder());
        members.put("user01", "사용자01");
        members.put("user02", "사용자02");
        members.put("user03", "사용자03");
        members.put("user04", "사용자04");
        members.put("user05", "사용자05");

        members.put("user03", "(수정)사용자03");
        members.remove("user03");
        String name = members.get("user03");
        System.out.println(name);
        
        String name2 = members.getOrDefault("user06", "없는 사용자");
        System.out.println(name2);

        //Set<Map.Entry<String, String>> entries = members.entrySet();
        for (Map.Entry<String, String> entry : members.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.printf("key=%s, value=%s%n", key, value);
        }
    }
}
