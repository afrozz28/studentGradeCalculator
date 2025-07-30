import java.util.*;

public class studentGradeCalculator {
    int n;
    int sum = 0;
    String[] subName = new String[n];
    int [] marks = new int[n];
    String Name;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            subName[i] = sc.nextLine();
        }

        for (int j = 0; j < n; j++) {
            System.out.print("Enter the marks of " + subName[j] + "out of 100: ");
            marks[j] = sc.nextInt();
        }
    }

    void display() {

         for (int k = 0; k <= marks.length; k++) {
            sum+= marks[k];
        }

        sum = sum*100/n;
        System.out.println("Percentage of "+Name+" is "+sum+"%");

        if (90 <= sum) {
            System.out.println("A Grade");
        }
        if (80 <= sum) {
            System.out.println("B Grade");
        }
        if (70 <= sum) {
            System.out.println("C Grade");
        }
        if (60 <= sum) {
            System.out.println("D Grade");
        }
        if (50 <= sum) {
            System.out.println("E Grade");
        }
        if (40 > sum) {
            System.out.println("F Grade");
        }

    }

}

class Student extends studentGradeCalculator {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.input();
        s1.display();
    }

}