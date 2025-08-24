public class Fibonacci {
    public static void main(String[] args) {
        int limit = Integer.parseInt(args[0]);
        int a = 0, b = 1;
        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
