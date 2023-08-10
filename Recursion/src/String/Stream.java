package String;

public class Stream {
    public static void main(String[] args) {
        System.out.println(skip("baccadah"));
        System.out.println(skipApple("Mango Apple Guava Apple Papaya"));
        System.out.println(skipAppNotApple("adggApplfsa"));
    }

    //When the function doesn't return anything.
    static void skip(String p, String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a'){
            skip(p, up.substring(1) );
        }else {
            skip(p + ch, up.substring(1));
        }
    }

    //When the function return the String.
    static String skip(String up){

        if (up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a'){
           return skip(up.substring(1) );
        }else {
            return ch + skip(up.substring(1));
        }
    }


    //Skip the String Apple.
    static String skipApple(String up){

        if (up.isEmpty()){
            return "";
        }

        String toRemove = "Apple";

        if (up.startsWith(toRemove)){
            return skipApple(up.substring(toRemove.length()) );
        }else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }


    //Only removes app when it is not ends as Apple.
    static String skipAppNotApple(String up){

        if (up.isEmpty()){
            return "";
        }

        String toRemove = "App";

        if (up.startsWith(toRemove) && !up.startsWith("Apple")){
            return skipAppNotApple(up.substring(toRemove.length()) );
        }else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
