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
    public void printArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of array: ");
        int n = scanner.nextInt();
        if(n > 1){
            int[] array = new int[n];
            for(int i = 0; i< n; i++){
                array[i] = scanner.nextInt();
            }
            System.out.println("Phần tử của mảng: ");
            System.out.print("{ ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i]);
                if (i < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }
        else if(n == 1){
            int[] array = new int[n];
            array[0]= scanner.nextInt();

            System.out.println("Mảng có 1 phần tử");
            System.out.println(array[0]);
        }
        else {
            System.out.println("Mảng rỗng");
        }
    }
}


