package Questions;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
//        dice("", 4);

        System.out.println(diceList( "", 4));
    }

    static void dice(String p , int up){

        if (up == 0){
            System.out.print(p + " ");
            return;
        }

        for (int i = 1; i <= 6 && i <= up; i++) {
            dice(p + i, up - i);
        }
    }

    static ArrayList<Integer> diceList(String p , int up){

        if (up == 0){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(Integer.valueOf(p));
            return list;
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= up; i++) {
            ans.addAll(diceList(p + i, up - i));
        }

        return ans;
    }
}
