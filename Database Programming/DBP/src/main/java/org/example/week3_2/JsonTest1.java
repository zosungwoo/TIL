package org.example.week3_2;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Iterator;
import java.util.Set;

public class JsonTest1 {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();  // {}
        System.out.println(obj);
        JSONArray arr = new JSONArray();  // []
        System.out.println(arr);

        obj.put("intValue", 3);
        obj.put("booleanValue", false);
        obj.put("doubleValue", 35d);
        obj.put("jsonObject", new JSONObject().put("k", "V").put("a", "b"));
        System.out.println(obj);

        arr.put(3).put(true).put("hello").put(new JSONArray().put("hi"));
        System.out.println(arr);


        JSONArray borrower = new JSONArray();
        borrower.put(new JSONObject().put("customer_name", "Adams").put("account_number","L-16"));
        borrower.put(new JSONObject().put("customer_name", "Curry").put("account_number","L-93"));

        System.out.println(borrower);


        Set<String> keySet = obj.keySet();

        for (String key :
                keySet) {
            Object value = obj.get(key);
//            if(value instanceof String v)
//                System.out.println(key + " -> " + v);
//            if(value instanceof Boolean b)
//                System.out.println(key + " -> " + b);
        }

        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Object value = obj.get(key);
            System.out.println(key + " -> " + value);
        }

        JSONArray array = new JSONArray().put(obj).put(new JSONObject().put("customer_name", "Curry").put("loan_number", "L-93"));
        System.out.println(array);

        for(int i = 0 ; i <array.length() ;i ++){
            JSONObject o =
                    array.getJSONObject(i);
            System.out.println(o);
        }

    }

}

