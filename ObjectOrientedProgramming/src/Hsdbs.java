public class Hsdbs {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Call the swap method to swap the values of a and b
        swap(a, b);

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}
