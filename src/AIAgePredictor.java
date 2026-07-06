import java.util.Scanner;

public class AIAgePredictor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your current age: ");
        int age = sc.nextInt();

        int currentYear = 2026;

        System.out.println("Age after 10 years: " + (age + 10));
        System.out.println("Age after 25 years: " + (age + 25));
        System.out.println("Age after 50 years: " + (age + 50));

        System.out.println("You will turn 100 in the year: "
                + (currentYear + (100 - age)));

        sc.close();
    }
}
