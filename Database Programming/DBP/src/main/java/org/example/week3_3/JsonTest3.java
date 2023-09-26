package org.example.week3_3;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;
import java.util.Set;

public class JsonTest3 {
    public static void main(String[] args) {
        // create an empty array
        JSONArray array = new JSONArray();
        // put values
        array.put(true);
        array.put(0d);
        array.put(0f);
        array.put(0);
        array.put(0l);
        // create an empty object
        JSONObject object = new JSONObject();
        // put values
        object.put("booleanValue", true);
        object.put("doubleValue", 0d);
        object.put("floatValue", 0f);
        object.put("intValue", 0);
        object.put("longValue", 0l);
        object.put("stringValue", "string");
        object.put("array", array);
        System.out.println(object.toString(1));
        // iteration
        Iterator<String> iter1 = object.keys();
        while (iter1.hasNext()) {
            String k = iter1.next();
            Object v = object.get(k);
            System.out.println(k + " : " + v);
        }
        Set<String> keySet = object.keySet();
        for (String k : keySet) {
            Object v = object.get(k);
            System.out.println(k + " : " + v);
        }
        Iterator<String> iter2 = keySet.iterator();
        while (iter2.hasNext()) {
            String k = iter2.next();
            Object v = object.get(k);
            System.out.println(k + " : " + v);
        }
        // get value
        double d = object.getDouble("doubleValue");
        System.out.println("doubleValue :" + d);
        // get value (fail due to invalid casting)
        try {
            String d1 = object.getString("doubleValue");
            System.out.println("doubleValue :" + d1);
        } catch (JSONException e) {
            System.out.println(e.getMessage());
        }

        // check key existence
        if(object.has("foo")) {
            System.out.println(object.get("foo"));
        }else {
            System.out.println("foo does not exist");
        }

        // get length
        System.out.println(object.length());
    }
}

