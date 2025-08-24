public class Factorial {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
}
