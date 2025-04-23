package com.ragnar;

import java.util.ArrayList;

public class FLAMES {
    public static void main(String[] args) {
        System.out.println(flame("raju", "pani"));
    }
    private static String flame(String name1, String name2) {   
        ArrayList<String> flames = new ArrayList<>();
        flames.add("Friends");
        flames.add("Lovers");   
        flames.add("Affectionate");
        flames.add("Marriage");
        flames.add("Enemies");
        flames.add("Siblings");
        for(int i = 0; i < name1.length(); i++) {
            if(name2.contains(Character.toString(name1.charAt(i)))) {
                char c = name1.charAt(i);
                name1 = name1.replace(String.valueOf(c), "");
                name2 = name2.replace(String.valueOf(c), "");
            }
        }
        int totalLength = name1.length() + name2.length();
        int index = 0;
        while(flames.size() > 1) {
            index = (index + (totalLength-1)) % flames.size();
            flames.remove(index);

        }
        return flames.get(0);
    }
}
