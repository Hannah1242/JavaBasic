import day1.DataTypesAndVariables;
import day2.DecisionMaking;
import day2.JavaIO;

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
        JavaIO javaIO = new JavaIO();
        //javaIO.print();

        //ex2
        System.out.println("Nhập n = ");
        Scanner scanner = new Scanner(System.in);
        //float n = scanner.nextFloat();
        int n = scanner.nextInt();
        decisionMaking.printDayOfWeek(n);

    }

}