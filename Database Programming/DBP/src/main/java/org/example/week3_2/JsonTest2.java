package org.example.week3_2;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JsonTest2 {

    public static void main(String[] args) throws Exception{
        BufferedReader r = new BufferedReader(new FileReader("/Users/sungwoo/Desktop/TIL/Database Programming/DBP/src/main/java/org/example/credit_info.json"));

        String text = "";
        while(true){
            String line = r.readLine();
            if(line == null)
                break;
            text += line + "\n";
        }
        System.out.println(text);


        JSONArray arr = new JSONArray(text);
        System.out.println(arr);
        List<CreditInfo> creditInfos  = new ArrayList<CreditInfo>();

        for(Object v: arr){
            JSONObject o = (JSONObject) v;
            int creditBalance = o.getInt("credit_balance");
            int branchName = o.getInt("branch_name");
            String customerName = o.getString("customer_name");

            CreditInfo info = new CreditInfo(customerName,branchName, creditBalance);
            creditInfos.add(info);
        }


        System.out.println(creditInfos);

        r.close();

    }
}
