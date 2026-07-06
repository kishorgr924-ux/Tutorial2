import java.util.Scanner;

class LogicalCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Enter third number: ");
        c = sc.nextInt();

        if((a + b) == c)
            System.out.println("Third number is the sum of first two.");
        else
            System.out.println("Third number is not the sum.");

        sc.close();
    }
}