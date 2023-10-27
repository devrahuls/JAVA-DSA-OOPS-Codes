public class Kgfdf {
    public static void main(String[] args) {

        System.out.println(firstBadVersion(5));
    }

    public static int firstBadVersion(int n) {
        int result = 1;


        for(int i = 1; i <= (n+1)/2; i++){

            if(isBadVersion(i)){
                result = i;
                break;
            }

            if(isBadVersion(n+1 - i)){
                result = n+1 - i;
                break;
            }
        }

        return result;
    }

    static boolean isBadVersion(int bad){
        if (bad == 4 || bad > 4){
            return true;
        }else {
            return false;
        }
    }
}
