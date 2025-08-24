public class SquareOrCube {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a > b) {
            System.out.println(a * a);          // square of first
        } else if (b > a) {
            System.out.println(b * b * b);      // cube of second
        } else {
            System.out.println("Both are equal");
        }
    }
}
