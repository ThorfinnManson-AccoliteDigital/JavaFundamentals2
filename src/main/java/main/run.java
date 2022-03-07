package main;

import java.util.*;

public class run {
    public static void main(String[] args) {
        String message = "";
        if (args.length == 0) {
            System.out.print("no input detected proceeding with test");
            message = "nothing was input";
        } else {
            message = String.join("", args);
        }

        Map<Character,String> lexFreq = getMap(message);

        for (var entry : lexFreq.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }


        if (args.length != 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.print(reverseString(args[i]) + " ");
            }
        }
        else{
            List<String> words = Arrays.asList(message.split(" "));
            for (int i = 0; i < words.size(); i++) {
                System.out.print(reverseString(words.get(i)) + " ");
            }
        }
    }

    static Map<Character,String> getMap(String message){
        Map<Character, String> outMap = new HashMap<>();
        char[] arr = message.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if(outMap.get(arr[i]) == null){
                outMap.put(arr[i], "#");
            }
            else{
                outMap.put(arr[i], outMap.get(arr[i])+"#");
            }
        }
        return outMap;
    }
    
    static public String reverseString(String input){
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return sb.toString();
    }
}
