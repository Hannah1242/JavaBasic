package day4;


import java.util.Scanner;

public class GradeAverage {
    public void printStudents() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numstudents = scanner.nextInt();
        int grades[] = new int[numstudents];
        for (int i = 0; i < numstudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            while (grade < 0 || grade > 100) {
                System.out.println("Invalid grade, try again...");
                System.out.print("Enter the grade for student " + (i + 1) + ": ");
                grade = scanner.nextInt();
            }
            grades[i] = grade;
        }
        double sum = 0;
        for (int grade: grades){
            sum = sum + grade;
        }
        double average =sum/numstudents;
        System.out.println("The average is: " + average);
    }
    public void printArray(int[] array){
        if (array == null || array.length == 0) {
            System.out.println("{}");
            return;
        }
        System.out.print("{");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "}");
    }

    public void printArray(double[] array) {
        if (array == null || array.length == 0) {
            System.out.println("{}");
            return;
        }
        System.out.print("{");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "}");
    }
    public void printArray(float[] array) {
        if (array == null || array.length == 0) {
            System.out.println("{}");
            return;
        }
        System.out.print("{");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "}");
    }


}


