import java.util.*;

class studentGradeCalculator {
    int n;
    int sum = 0;
    String[] subName;
    int[] marks;
    String Name;

    void input() {
        System.out.println("\nStudent's Grade Calculator\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of student: ");
        Name = sc.nextLine();
        System.out.print("Enter the number of subjects: ");
        n = sc.nextInt();
        System.out.println();
        sc.nextLine(); // consume leftover newline
        marks = new int[n];
        subName = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            subName[i] = sc.nextLine();
        }

        System.out.println("\n");

        for (int j = 0; j < n; j++) {
            System.out.print("Enter the marks of " + subName[j] + " out of 100: ");
            marks[j] = sc.nextInt();
        }
    }

    void display() {
        System.out.println();
        for (int k = 0; k < marks.length; k++) {
            sum += marks[k];
        }

        sum = sum * 100 / (n * 100);
        System.out.println("Percentage of " + Name + " is " + sum + "%");
        System.out.print("Grade is: ");
        if (90 <= sum) {
            System.out.println("A Grade");
            System.out.println("Result is Pass");
        } else if (80 <= sum) {
            System.out.println("B Grade");
            System.out.println("Result is Pass");
        } else if (70 <= sum) {
            System.out.println("C Grade");
            System.out.println("Result is Pass");
        } else if (60 <= sum) {
            System.out.println("D Grade");
            System.out.println("Result is Pass");
        } else if (50 <= sum) {
            System.out.println("E Grade");
            System.out.println("Result is Pass");
        } else {
            System.out.println("F Grade");
            System.out.println("Result is Fail");
        }
        System.out.println();
    }

}

public class student extends studentGradeCalculator {

    public static void main(String[] args) {

        student s1 = new student();
        s1.input();
        s1.display();
    }

}