package String;

import java.util.ArrayList;

public class ASCII {
    public static void main(String[] args) {
        subSeqASCII("", "abc");
        System.out.println();
        System.out.println(subSeqASCIIReturn("", "abc"));
    }

    //Print the subsequence along with the ASCII value of that particular element. No Return.
    static void subSeqASCII(String p, String up){

        //When up (unprocessed) is empty, means we iterate to the very left part of recursion, so now we print and return so that right part of
        // recursion also runs.
        if (up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);

        subSeqASCII(p + ch, up.substring(1)); //When we take an element.
        subSeqASCII(p, up.substring(1)); //When we ignore an element.
        subSeqASCII(p + (ch + 0), up.substring(1)); //When we take ASCII value of that particular element. ch + 0 (a + 0) gives the ASCII
        // value of a character.
    }


    //Print the subsequence along with the ASCII value of that particular element. With Return.
    static ArrayList<String> subSeqASCIIReturn(String p, String up){

        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subSeqASCIIReturn(p + ch, up.substring(1)); //When we take an element. (left recursion call)
        ArrayList<String> second = subSeqASCIIReturn(p, up.substring(1)); //When we ignore an element. (right recursion call)
        ArrayList<String> third = subSeqASCIIReturn(p + (ch + 0), up.substring(1)); //When we ignore an element. (right recursion call)


        first.addAll(second);
        first.addAll(third);
        return first; //we can't return second or third bcz first is the only array where second and third is being merged.
    }
}
