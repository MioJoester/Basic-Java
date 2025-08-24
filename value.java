public class Compare {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a > b) {
            System.out.println("First is bigger");
        } else if (b > a) {
            System.out.println("Second is bigger");
        } else {
            System.out.println("Both are equal");
        }
    }
}
