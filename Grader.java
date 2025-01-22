// Mateo Garcia Ibarra
// Lab 1 Part C



// anything less than 40 is failing

import java.util.Scanner;

public class Grader{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int student = 0; student < number; student++){
            int grade = scanner.nextInt();
            System.out.println(roundGrade(grade));
        }
    scanner.close();
    }

public static int roundGrade(int grade) {
    if (grade < 38){
        return grade;
    }

    int multipleOf5 = ((grade/5) + 1) * 5;

    if (multipleOf5 - grade < 3) {
        return multipleOf5;
    } else {
        return grade;
    }
}

}