package String;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) {
        permutations("", "abc");

        System.out.println();

        ArrayList<String> ans = permutationsList("", "abc");
        System.out.println(ans);

        System.out.println(permutationsCount("", "abc"));

    }

    //No return.
    static void permutations(String p, String up){

        if (up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            permutations(f + ch + s, up.substring(1));
        }
    }


    //Return the string as a list of Array.
    static ArrayList<String> permutationsList(String p, String up){

        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        //local for every fn call.
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }

        return ans;
    }


    //Count how many possible outcomes we are going to get from these 3 character values.
    static int permutationsCount(String p, String up){

        if (up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            count = count + permutationsCount(f + ch + s, up.substring(1));
        }

        return count;
    }
}
