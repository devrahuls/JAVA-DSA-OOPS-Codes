package com.rahul;

import java.util.ArrayList;

public class CountItemsMatching {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> items = new ArrayList<>();
        String ruleKey = "type";
        String ruleValue = "phone";

        int sum = 0;

        for(int i = 0; i < items.size(); i++){

            if(ruleKey == "type"){
                if(items.get(i).get(0) == ruleValue){
                    sum++;
                }
            }

            if(ruleKey == "color"){
                if(items.get(i).get(1) == ruleValue){
                    sum++;
                }
            }

            if(ruleKey == "name"){
                if(items.get(i).get(2) == ruleValue){
                    sum++;
                }
            }
        }

        System.out.println(sum);
    }
}
