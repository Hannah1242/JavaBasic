import day1.DataTypesAndVariables;
import day2.DecisionMaking;
import day3.Loop;
import day3.OddTest;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DataTypesAndVariables dataTypesAndVariables = new DataTypesAndVariables();
        //dataTypesAndVariables.printString();
        //dataTypesAndVariables.printStringMultiLine();
        //dataTypesAndVariables.printVariable();
        //dataTypesAndVariables.printBoolean();
        //dataTypesAndVariables.testOperator();
        //dataTypesAndVariables.calcuCelsius();
        //dataTypesAndVariables.calMeters();
//        //dataTypesAndVariables.nonNegative();

        DecisionMaking decisionMaking = new DecisionMaking();
        // exe1
//        System.out.println("Nhập n = ");
//        Scanner scanner = new Scanner(System.in);
//        //String myString = scanner.next();
//        int myInt = scanner.nextInt();
//        decisionMaking.checkNum(myInt);

        // ex
        //JavaIO javaIO = new JavaIO();
        //javaIO.print();

        //ex2
        //System.out.println("Nhập n = ");
       // Scanner scanner = new Scanner(System.in);
        //float n = scanner.nextFloat();
        //int n = scanner.nextInt();
       // decisionMaking.printDayOfWeek(n);
        Loop loop = new Loop();
        loop.printSquareBoard();
        loop.SumAndAverageEx2();
        // method - exe1
//        OddTest oddTest = new OddTest();
//        System.out.println("Nhập số thứ nhất: ");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        System.out.println("Nhập số thứ hai: ");
//        int m = scanner.nextInt();
//
//        if(oddTest.isOdd(8)  == true){
//            System.out.println(" là số lẻ");
//        } else System.out.println(" không phải số lẻ");
//        if(oddTest.isOdd(n) == true){
//            System.out.println(n + " là số lẻ");
//        }else System.out.println(n + "là số chẵn");
//        if(oddTest.isOdd(m) == true){
//            System.out.println(m + " là số lẻ");
//        }else System.out.println(m + " là số chẵn");
    //ex 2,3
        OddTest oddTest1 = new OddTest();
        if(oddTest1.hasEight(98) == true){
            System.out.println("number contain digit 8 ");
        }

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a positive integer or -1 to exit:");
        while (true) {
            int num = scanner.nextInt();

            if (num == -1) {
                break;
            }
            if (oddTest1.hasEight(num)) {
                sum += num;
            }

            System.out.println("Enter a positive integer or -1 to exit:");
        }

        System.out.println("\t The magic sum is: " + sum);
    }

}