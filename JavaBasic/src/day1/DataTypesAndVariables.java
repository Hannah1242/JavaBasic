package day1;

public class DataTypesAndVariables {
    //1 method-ex1
    public void printString(){
        System.out.println("Hello World");
    }
    public void printStringMultiLine(){
        System.out.println("++++++\n" +
                "\n" +
                "@@@@@@\n" +
                "\n" +
                "******\n" +
                "\n" +
                "######\n");
    }

    // \n: xuống dòng
    public void printVariable(){
        byte a = 10;
        float b = 20.3f;
        float c = 3.14785f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public void printBoolean(){
        boolean a = true;
        a = false;
        System.out.println(a);
    }
    public void testOperator(){
        int i = 5;
        int a = 2; // postfix: tăng nhưng không gán
        int b = 5;// prefix:tăng rồi gán\
         a += b; // a = a + b
        System.out.println(a);
        System.out.println(b);
    }
    public void calcuCelsius(){
        float celsius;
        float fah = 212;
        celsius = (float)((fah - 32)/1.8000);
        System.out.println(celsius);
    }
    public void calMeters(){
        float meters;
        short inch = 1000;
        meters = (float) ((inch * 0.0254));
        System.out.println(meters);
    }
    public void calSpeed(){
        float distance = 2500;
        byte h = 5;
        byte minutes = 56;
        byte seconds = 23;
        float time = (h*3600) + (minutes*60) + seconds;
        float ms = distance / time;
        float kmh = ( distance/1000.0f ) / ( time/3600.0f );
        float mlh = kmh / 1.609f;
        System.out.println("Your speed in meters/second is:" + ms);
        System.out.println("Your speed in kilometer/hours is:" + kmh);
        System.out.println("Your speed in miles/hours is:" + mlh);
    }
    public void relationInteger(){
        byte a = 25;
        byte b = 5;
        byte max = (a > b) ? a : b;
        byte min = (a > b) ? b : a;
        System.out.println("Sum of two integer is " + (a + b));
        System.out.println("Difference of two integers is " + (a - b));
        System.out.println("Product of two integers is " + (a * b));
        System.out.println("Average of two integers is " + (a + b)/2);
        System.out.println("Distance of two integers is " + (a - b));
        System.out.println("Maximum of two integers is " + max);
        System.out.println("Minimum of two integer is " + min);

    }
    public void nonNegative(){
        int a = 123456;
        int a1 = a / 100000;
        int a2 = a / 10000 %10;
        int a3 = a / 1000 %10;
        int a4 = a / 100 %10;
        int a5 = a / 10 %10;
        int a6 = a % 10;
        System.out.println(a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " + a6);
    }

}

