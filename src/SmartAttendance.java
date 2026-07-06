import java.util.Scanner;

class AttendanceChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes conducted: ");
        int conducted = sc.nextInt();

        System.out.print("Enter classes attended: ");
        int attended = sc.nextInt();

        double percentage = (attended * 100.0) / conducted;

        System.out.println("Attendance Percentage = " + percentage + "%");

        if (percentage >= 75)
            System.out.println("Eligible for Exam");
        else
            System.out.println("Not Eligible");

        sc.close();
    }
}