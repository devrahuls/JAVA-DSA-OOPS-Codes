package String;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {
    public static void main(String[] args) {
        subSeq("", "abc");
        System.out.println();
        System.out.println(subSeqReturn("", "abc"));
    }

    //Without return.
    static void subSeq(String p, String up){

        //When up (unprocessed) is empty, means we iterate to the very left part of recursion, so now we print and return so that right part of
        // recursion also runs.
        if (up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);

        subSeq(p + ch, up.substring(1)); //When we take an element. (left recursion call)
        subSeq(p, up.substring(1)); //When we ignore an element. (right recursion call)

    }


    //With Return.
    static ArrayList<String> subSeqReturn(String p, String up){

        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subSeqReturn(p + ch, up.substring(1)); //When we take an element. (left recursion call)
        ArrayList<String> right = subSeqReturn(p, up.substring(1)); //When we ignore an element. (right recursion call)

        left.addAll(right);
        return left; //we can also return right. it doesn't matter bcz both left and right has been merged with each other.
    }

}
