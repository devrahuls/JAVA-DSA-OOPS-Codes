package Leetcode;

//Leetcode #771 Jewels and stones.
public class AiseHe {
    public static void main(String[] args) {
        String jewel = "abAc";
        String stone = "aAAbdp";

        int count = 0;

        for (int i = 0; i < jewel.length(); i++) {

            for (int j = 0; j < stone.length(); j++) {
                char l = jewel.charAt(i);
                char r = stone.charAt(j);

                if (l == r){
                    count ++;
                }
            }
        }

        System.out.println(count);
    }
}
