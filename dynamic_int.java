public class SimpleInterest {
    public static void main(String[] args) {
        double p = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);

        double si = p * r * t / 100;
        System.out.println("Simple Interest: " + si);
    }
}
