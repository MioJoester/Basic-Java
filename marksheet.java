public class Marks {
    public static void main(String[] args) {
        int m1 = Integer.parseInt(args[0]);
        int m2 = Integer.parseInt(args[1]);
        int m3 = Integer.parseInt(args[2]);

        int total = m1 + m2 + m3;
        double avg  = total / 3.0;

        String grade;
        if (avg >= 90) grade = "A+";
        else if (avg >= 80) grade = "A";
        else if (avg >= 70) grade = "B";
        else if (avg >= 60) grade = "C";
        else if (avg >= 50) grade = "D";
        else               grade = "F";

        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}
